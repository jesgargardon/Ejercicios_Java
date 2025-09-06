import java.util.ArrayList;
import java.util.Scanner;
public class TallerReparacion {

    public static void main(String[] args) {
        
        boolean salir = false;
        int eleccion = 0;
        ArrayList<Coche>coches = new ArrayList<>();
        Coche cocheEntregado = null;
               
        while(!salir){
            presentarMenus();
            eleccion=introducirOpcion();
            switch (eleccion){
                case 1:
                    coches.add(introducirCoche());
                    break;
                case 2:
                    cocheEntregado=salidaCoche(coches);
                    if (cocheEntregado!=null){
                        coches.remove(cocheEntregado);
                    }
                    break;
                case 3:
                    listadoCoches(coches);
                    break;
                case 4:
                    salir=true;
                    break;
            }       
        }
    }
    public static void presentarMenus(){
        System.out.println("------------------------");
        System.out.println("PROGRAMA GESTIÓN TALLER");
        System.out.println("------------------------");
        System.out.println("1.- Entrada nueva reparación");
        System.out.println("2.- Salida de coche reparado");
        System.out.println("3.- Listado de vehículos");
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
    public static Coche introducirCoche(){
        String propietario, matricula, marca;
        boolean reparado;
        
        Scanner lec1 = new Scanner(System.in);
        Scanner lec2 = new Scanner(System.in);
        Scanner lec3 = new Scanner(System.in);
        System.out.println("Introduce el propietario del vehículo:");
        propietario = lec1.nextLine();
        System.out.println("Introduce la matricula del vehículo:");
        matricula = lec2.nextLine();
        System.out.println("Introduce la marca del vehículo:");
        marca = lec3.nextLine();

        return new Coche(propietario, matricula, marca, false);
    }
    public static void listadoCoches(ArrayList<Coche>listaCoches){
        if (listaCoches.isEmpty()){
            System.out.println("No hay coches en el taller");
        }else{
            for (Coche coche: listaCoches){
                System.out.println(coche.toString());
            }
        }
    }
    public static Coche salidaCoche (ArrayList<Coche>listaCoches){
        System.out.println("Introduce nombre propietario del coche a entregar:");
        boolean encontrado=false;
        Scanner ent = new Scanner(System.in);
        String prop = ent.nextLine();
        for (Coche coche: listaCoches){
            if (coche.getPropietario().equals(prop)){
                System.out.println("Coche Entregado: "+coche.toString());
                coche.setReparado(true);
                encontrado=true;
                return coche;
            }
        }
        if (!encontrado){
            System.out.println("Coche NO encontrado");
        }
        return null;
    }
}
