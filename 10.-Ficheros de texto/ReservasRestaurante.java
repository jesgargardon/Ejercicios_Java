import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservasRestaurante {

    public static void main(String[] args) {
       File fichero = new File("reservas.txt");
        
        boolean salir = false;
        int eleccion = 0;
        ArrayList<Reserva>reservas = new ArrayList<>();
        Reserva reservaEncontrada = null;
        
       if (fichero.exists()){
           System.out.println("Cargados datos");
           reservas=cargarDatos(fichero);
       }
               
        while(!salir){
            presentarMenus();
            eleccion=introducirOpcion();
            switch (eleccion){
                case 1:
                    reservas.add(introducirReserva());
                    break;
                case 2:
                    reservaEncontrada = cancelacionReserva(reservas);
                    if (reservaEncontrada!=null){
                        reservas.remove(reservaEncontrada);
                    }
                    break;
                case 3:
                    listadoReservas(reservas);
                    break;
                case 4:
                    salir=true;
                    guardarDatos(fichero,reservas);
                    break;
            }       
        }
        
    }
    public static void presentarMenus(){
        System.out.println("------------------------");
        System.out.println("PROGRAMA RESERVA EN RESTAURANTE");
        System.out.println("------------------------");
        System.out.println("1.- Introducir una reserva nueva");
        System.out.println("2.- Cancelar reserva");
        System.out.println("3.- Listado de reservas");
        System.out.println("4.- Salir");
        
    }
    public static int introducirOpcion(){
        boolean valida= false;
        int opcion=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la opción deseada");
        while(!valida){
            opcion = entrada.nextInt();
            if (opcion>0 && opcion<5){
                valida=true;
            }else{
                System.out.println("OPCION INCORRECTA");
                System.out.println("La opción elegida tiene que estar entre 1 y 4");
                System.out.println("Por favor, introduce opción correcta");
            }
        }
        return opcion;
    }
    public static Reserva introducirReserva(){
        String dia, turno;
        int mesa,comensales;
        
        Scanner lec1 = new Scanner(System.in);
        Scanner lec2 = new Scanner(System.in);
        Scanner lec3 = new Scanner(System.in);
        Scanner lec4 = new Scanner(System.in);
        System.out.println("Introduce el dia de la reserva:");
        dia = lec1.nextLine();
        System.out.println("Introduce el numero de la mesa:");
        mesa = lec2.nextInt();
        System.out.println("Introduce a nombre de quien se registra la reserva:");
        turno = lec3.nextLine();
        System.out.println("Introduce el numero de comensales:");
        comensales = lec4.nextInt();

        return new Reserva(dia, mesa, turno, comensales);
    }
    public static Reserva cancelacionReserva (ArrayList<Reserva>listaReservas){
        System.out.println("Introduce nombre de a quien está registrada la reserva:");
        boolean encontrado=false;
        Scanner ent = new Scanner(System.in);
        String nombre = ent.nextLine();
        for (Reserva reserva: listaReservas){
            if (reserva.getNombre().equals(nombre)){
                System.out.println("Reserva encontrada: "+reserva.toString());
                encontrado=true;
                return reserva;
            }
        }
        if (!encontrado){
            System.out.println("Reserva NO encontrada");
        }
        return null;
    }
    public static void listadoReservas(ArrayList<Reserva>listaReservas){
        if (listaReservas.isEmpty()){
            System.out.println("No hay reservas registradas");
        }else{
            System.out.println("Listado de reservas");
            System.out.println("--------------------");
            for (Reserva reserva: listaReservas){
                System.out.println(reserva.toString());
            }
        }
    }
    public static ArrayList<Reserva> cargarDatos(File fich){
        ArrayList<Reserva>listaDeReservas = new ArrayList<>();
        int contador = 0;
        String linea="",dia="",nombre="";
        int mesa=0,comensales=0;
        try {
            Scanner sc = new Scanner(fich);
            while (sc.hasNext()){
                linea = sc.nextLine();
                contador++;
                switch(contador){
                    case 1:
                        dia=linea;
                    break;
                    case 2:
                        mesa=Integer.parseInt(linea);
                    break;
                    case 3:
                        nombre=linea;
                    break;
                    case 4:
                        comensales=Integer.parseInt(linea);
                        contador=0;
                    break;
                }
            if (contador==0){
                Reserva reserva= new Reserva(dia,mesa,nombre,comensales);
                listaDeReservas.add(reserva);
            }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReservasRestaurante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDeReservas;
    }
    public static void guardarDatos(File f,ArrayList<Reserva>lista){
        try {
            f.createNewFile();
            FileWriter escribir = new FileWriter(f);
            for (Reserva res: lista){
                escribir.append(res.getDia()+"\n");
                escribir.append(res.getMesa()+""+"\n");
                escribir.append(res.getNombre()+"\n");
                escribir.append(res.getComensales()+""+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(ReservasRestaurante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
