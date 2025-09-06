import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class GestionMultas {


    public static void main(String[] args) {
        boolean salir=false;
        ArrayList<Multa> multas = new ArrayList<>();
        String fichero = "multas.txt";
        int opcion;
        File f = new File(fichero);
        if (f.exists()){
            multas=cargarDatos(f);//cargar datos
        }
        do{
            opcion=escoger_opcion();
            switch (opcion){
                    case 1:
                        multas.add(alta_multa());
                        break;
                    case 2:
                        registrarPago(multas);
                        break;
                    case 3:
                        listadoMultasPendientes(multas);
                        break;
                    case 4:
                        listadoTodasMultas(multas);
                        break;
                    case 5:
                        guardarDatos(multas);
                        salir=true;
                        break;
            }
        }while(!salir);
    }
    public static int escoger_opcion(){
        int op=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Selecciona una opicón por su numero ------");
        System.out.println("1.- Dar de alta una multa nueva");
        System.out.println("2.- Registrar una multa como pagada");
        System.out.println("3.- Listado de multas pendientes de pago");
        System.out.println("4.- Listado completo de todas las multas");
        System.out.println("5.- Salir");
        System.out.println("tu opción?: ");
        op=sc.nextInt();
        return op;
    }
    public static Multa alta_multa(){
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int tipo=0;
        System.out.println("Introduce la matricula");
        String matricula = sc1.nextLine();
        System.out.println("---- Tipos de infracciones -----");
        System.out.println("1.- Aparcar en doble fila (50€)");
        System.out.println("2.- Estacionar en zona azul y no pagar ticket (30€)");
        System.out.println("3.- Saltarse semáforo en rojo (100€)");
        System.out.println("Introduce el número de la infracción");
        do{
            tipo = sc2.nextInt();
            if (tipo<1 || tipo>3){
                System.out.println("Introduce un tipo entre 1 y 3");
            }
        }while(tipo<1 || tipo>3);
        return new Multa(matricula,tipo,false);
    
    }
    public static ArrayList<Multa> cargarDatos(File f){
        String mat,linea;
        int tipo;
        boolean pagada;
        ArrayList<Multa> lista = new ArrayList<>();
        try {
            Scanner sc= new Scanner(f);
            while (sc.hasNext()){
                mat=sc.nextLine();
                linea=sc.nextLine();
                tipo=Character.getNumericValue(linea.charAt(0));
                linea=sc.nextLine();
                if (linea.equals("true")){
                    pagada=true;
                }
                else{
                    pagada=false;
                }
                lista.add(new Multa(mat,tipo,pagada));
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        return lista;
    }
    public static void listadoTodasMultas(ArrayList<Multa> list){
        for (Multa m: list){
            System.out.println("Matricula: "+m.getMatricula()+" - tipo infracción: "+m.getTipo()+" - ¿Pagada? "+m.isPagada());
        }
    }
    public static void listadoMultasPendientes(ArrayList<Multa> list){
        for (Multa m: list){
            if (!m.isPagada()) {
                System.out.println("Matricula: " + m.getMatricula() + " - tipo infracción: " + m.getTipo() + " - ¿Pagada? " + m.isPagada());
            }
        }
    }
    private static void registrarPago(ArrayList<Multa>multas) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la matrícula del vehículo: ");
        String matricula = sc.nextLine().trim();

        boolean encontrada = false;

        for (Multa m : multas) {
            if (m.getMatricula().equalsIgnoreCase(matricula) && !m.isPagada()) {
                m.setPagada(true);
                System.out.println("Multa marcada como pagada correctamente.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró ninguna multa pendiente con esa matrícula.");
        }
    }
    private static void guardarDatos(ArrayList<Multa>multas) {
        try {
            FileWriter fw = new FileWriter("multas.txt");
            for (Multa m : multas) {
                fw.write(m.getMatricula() + "\n");
                fw.write(m.getTipo() + "\n");
                fw.write((m.isPagada() ? "Pagada" : "Pendiente") + "\n");
            }
            fw.close();
            System.out.println("Datos guardados correctamente en multas.txt.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }


}
