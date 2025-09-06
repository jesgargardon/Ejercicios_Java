import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalariosEmpleados {

    public static void main(String[] args) {
        int menu;
        boolean salir=false;
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        File datos = new File("salario_empleados.txt");
        if(datos.exists()){
            empleados=cargarDatos(datos);
            System.out.println("Datos cargados");
        }
        while(!salir){
            presentarMenus();
            menu=introducirOpcion();
            switch(menu){
                case 1:
                    empleados.add(introducirEmpleado());
                    break;
                case 2:
                    listadoEmpleados(empleados);
                    break;
                case 3:
                    salir=true;
                    guardarDatos(datos,empleados);
                    break;
            }
        }
    }
    
    public static void presentarMenus(){
        System.out.println("------------------------");
        System.out.println("EMPLEADOS");
        System.out.println("------------------------");
        System.out.println("1.- Registrar empleado nuevo");
        System.out.println("2.- Listado de empleados");
        System.out.println("3.- Salir");

    }

    public static int introducirOpcion(){
        boolean valida= false;
        int opcion=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la opción deseada");
        while(!valida){
            opcion = entrada.nextInt();
            if (opcion>0 && opcion<4){
                valida=true;
            }else{
                System.out.println("OPCION INCORRECTA");
                System.out.println("La opción elegida tiene que estar entre 1 y 3");
                System.out.println("Por favor, introduce opción correcta");
            }
        }
        return opcion;
    }
    
    public static Empleado introducirEmpleado(){
        String nombre,direccion;
        int antiguedad, salario;
        
        Scanner lec1 = new Scanner(System.in);
        Scanner lec2 = new Scanner(System.in);
        Scanner lec3 = new Scanner(System.in);
        Scanner lec4 = new Scanner(System.in);
        System.out.println("Introduce el nombre del empleado:");
        nombre = lec1.nextLine();
        System.out.println("Introduce la direccion del empleado:");
        direccion = lec2.nextLine();
        System.out.println("Introduce la antigüedad en años del empleado:");
        antiguedad = lec3.nextInt();
        System.out.println("Introduce el salario del empleado:");
        salario = lec4.nextInt();

        return new Empleado (nombre, direccion, antiguedad, salario);
    }
    
    public static void listadoEmpleados(ArrayList<Empleado>listaEmpleados){
        if (listaEmpleados.isEmpty()){
            System.out.println("No hay empleados registrados");
        }else{
            System.out.println("Listado de empleados");
            System.out.println("--------------------");
            for (Empleado emp: listaEmpleados){
                emp.datosEmpleado();
            }
        }
    }

        public static ArrayList<Empleado> cargarDatos(File fich){
        ArrayList<Empleado>listaDeEmpleados=new ArrayList<>();
        String nombre, direccion,linea;
        int antiguedad,salario;
        try{
            Scanner sc=new Scanner(fich);
            while (sc.hasNext()){
                nombre=sc.nextLine();
                direccion=sc.nextLine();
                linea=sc.nextLine();
                antiguedad=Integer.parseInt(linea);
                linea=sc.nextLine();
                salario=Integer.parseInt(linea);
                Empleado emp=new Empleado(nombre, direccion, antiguedad, salario);
                listaDeEmpleados.add(emp);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("fichero no encontrado");
        }
        return listaDeEmpleados;
    }
    
    public static void guardarDatos(File f, ArrayList<Empleado> lista){
        try{
            f.createNewFile();
            FileWriter escribir= new FileWriter(f);
            for (Empleado emp: lista){
                escribir.append(emp.getNombre()+"\n");
                escribir.append(emp.getDireccion()+"\n");
                escribir.append(emp.getAñosAntiguedad()+"\n");
                escribir.append(emp.getSalario()+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error guardando los datos en el fichero");
        }
    }
}
