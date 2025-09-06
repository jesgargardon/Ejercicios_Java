
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class FlotaCoches {

    public static void main(String[] args) {
        int menu;
        boolean salir=false;
        ArrayList<Coche> flotaCoches = new ArrayList<>();
        String ruta="c:\\java\\flotaCoches.txt";
        File fichero =  new File (ruta);
        if (!fichero.exists()){
            crearFichero(fichero);
        }else {
            flotaCoches = cargarDatosFichero(fichero);
        }
        while (!salir){
            menu=seleccionarMenu();
            switch(menu){
                case 1:
                    flotaCoches=AsignarConductor(flotaCoches);
                break;
                case 2:
                    flotaCoches=cambiarEstadoCoche(flotaCoches);
                        break;
                case 3:
                    pintarFlota(flotaCoches);
                break;
                case 4:
                    flotaCoches=AltaCoche(flotaCoches);
                break;
                case 5:
                    guardarDatosEnFichero(fichero, flotaCoches);
                    salir=true;
                break;
            }
        }
    }
    public static void crearFichero(File fich){
        try {
            fich.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error creando el fichero: "+ex);
        }
    }
    public static ArrayList<Coche> cargarDatosFichero (File f){
        ArrayList<Coche> coches = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[]campos = linea.split(",");
                String matricula = campos[0];
                String modelo = campos[1];
                boolean operativo = Boolean.parseBoolean(campos[2]);
                String conductor = campos[3];
                coches.add(new Coche(matricula, modelo,operativo,conductor));
            }
        } catch (IOException ex){
            System.out.println("Error leyendo el los datos de los coches: "+ex);
        }
       return coches;
    }
    public static void pintarFlota(ArrayList<Coche> coches){
        for (Coche coche : coches){
            System.out.println(coche.getModelo()+" -- "+coche.getMatricula());
            System.out.println("-------------------------------------------");
            System.out.println("La matricula del coche es: "+coche.getMatricula());
            System.out.println("El modelo del coche es: "+coche.getModelo());
            System.out.println("Operativo? "+coche.isOperativo());
            System.out.println("El conductor asignado es: " + coche.getConductorAsignado());
            System.out.println(" ");
        }
    }
    public static int seleccionarMenu(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("OPCIONES DISPONIBLES");
        System.out.println("====================================");
        System.out.println("1.-Asignar un coche a un conductor");
        System.out.println("2.-Cambiar el estado de un coche");
        System.out.println("3.-Datos de todos los coches");
        System.out.println("4.-Dar de alta un coche en la flota");
        System.out.println("5.-Guardar / salir");
        System.out.println("¿Qué desea hacer?");
        opcion = sc.nextInt();
        while (opcion<1 || opcion>5){
            System.out.println("Opcion no valida. Por favor, introduzca una opción entre 1 y 5");
            opcion = sc.nextInt();
        }
        
        return opcion;
    }
    public static ArrayList<Coche> cambiarEstadoCoche(ArrayList<Coche> coches){
        String linea;
        boolean encontrada=false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la matricula del coche al que quieres cambiar el estado:");
        linea = sc.nextLine();
        for (Coche car : coches) {
            if (linea.equals(car.getMatricula())) {
                encontrada=true;
                if (car.isOperativo()) {
                    car.setOperativo(false);
                    System.out.println("El coche estaba operativo y ha pasado a NO operativo");
                } else {
                    car.setOperativo(true);
                    System.out.println("El coche NO estaba operativo y ha pasado a operativo");
                }
            }
        }
        if (!encontrada){
            System.out.println("No se ha encontrado la matricula");
        }
        return coches;
    }
    public static ArrayList<Coche> AsignarConductor(ArrayList<Coche> coches){
        String linea,conductor;
        boolean encontrada=false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la matricula del coche al que quieres asignar conductor:");
        linea = sc.nextLine();
        System.out.println("Introduce el nombre del conductor conductor:");
        conductor = sc.nextLine();
        for (Coche car : coches) {
            if (linea.equals(car.getMatricula())) {
                encontrada=true;
                if (car.isOperativo()){
                    car.setConductorAsignado(conductor);
                    System.out.println("Conductor: "+conductor+" , asignado a "+car.getModelo()+" - "+car.getMatricula());
                }
                else{
                    System.out.println("Lo lamento pero no podemos asignar el conductor. El coche no está operativo");
                }
            }
        }
        if (!encontrada){
            System.out.println("No se ha encontrado la matricula");
        }
        return coches;
    }

    public static ArrayList<Coche> AltaCoche (ArrayList<Coche>coches){
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_boolean = new Scanner (System.in);
        System.out.println("Introduce la matricula");
        String matricula=sc_string.nextLine();
        System.out.println("Introduce el modelo");
        String modelo=sc_string.nextLine();
        System.out.println("¿Esta el coche operativo?(True/False)");
        boolean operativo =sc_boolean.nextBoolean();
        System.out.println("Introduce el conductor");
        String conductor=sc_string.nextLine();
        coches.add(new Coche(matricula, modelo, operativo, conductor));
        return coches;
    }
    public static void guardarDatosEnFichero(File f, ArrayList<Coche> coches){
        try {
            FileWriter filewriter = new FileWriter(f);
            BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
            for (Coche car : coches){
                bufferedWriter.write(car.getMatricula()+","+car.getModelo()+","+car.isOperativo()+","+car.getConductorAsignado());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("No se creo el fichero");
        }
    
    }
}
