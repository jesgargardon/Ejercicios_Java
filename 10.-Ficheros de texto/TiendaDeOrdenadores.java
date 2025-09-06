
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiendaDeOrdenadores {

    public static void main(String[] args) {
        int menu;
        boolean salir=false;
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        File datos = new File("pedidos_ordenadores.txt");
        if(datos.exists()){
            pedidos=cargarDatos(datos);
            System.out.println("Datos cargados");
        }
        while(!salir){
            presentarMenus();
            menu=introducirOpcion();
            switch(menu){
                case 1:
                    pedidos.add(introducirPedido());
                    break;
                case 2:
                    listadoPedidos(pedidos);
                    break;
                case 3:
                    salir=true;
                    guardarDatos(datos,pedidos);
                    break;
            
            }
        }
        
    }
    public static void presentarMenus(){
        System.out.println("------------------------");
        System.out.println("PEDIDOS DE ORDENADORES");
        System.out.println("------------------------");
        System.out.println("1.- Registrar pedido nuevo");
        System.out.println("2.- Listado de pedidos");
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
    
    public static Pedido introducirPedido(){
        String comprador,direccion, marca;
        int precio;
        
        Scanner lec1 = new Scanner(System.in);
        Scanner lec2 = new Scanner(System.in);
        Scanner lec3 = new Scanner(System.in);
        Scanner lec4 = new Scanner(System.in);
        System.out.println("Introduce el comprador:");
        comprador = lec1.nextLine();
        System.out.println("Introduce la direccion de entrega del pedido:");
        direccion = lec2.nextLine();
        System.out.println("Introduce la marca del ordenador:");
        marca = lec3.nextLine();
        System.out.println("Introduce el precio:");
        precio = lec4.nextInt();

        return new Pedido(comprador, direccion, marca, precio);

        
    }
    
    public static void listadoPedidos(ArrayList<Pedido>listaPedidos){
        if (listaPedidos.isEmpty()){
            System.out.println("No hay pedidos registrados");
        }else{
            System.out.println("Listado de pedidos");
            System.out.println("--------------------");
            for (Pedido ped: listaPedidos){
                ped.dat();
            }
        }
    }

    public static ArrayList<Pedido> cargarDatos(File fich){
        ArrayList<Pedido>listaDePedidos=new ArrayList<>();
        String comprador, direccion, marca, p;
        int precio;
        try{
            Scanner sc=new Scanner(fich);
            while (sc.hasNext()){
                comprador=sc.nextLine();
                direccion=sc.nextLine();
                marca=sc.nextLine();
                p=sc.nextLine();
                precio=Integer.parseInt(p);
                Pedido pedido=new Pedido(comprador, direccion, marca, precio);
                listaDePedidos.add(pedido);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("fichero no encontrado");
        }
        return listaDePedidos;
    }
    
    public static void guardarDatos(File f, ArrayList<Pedido> lista){
        try{
            f.createNewFile();
            FileWriter escribir= new FileWriter(f);
            for (Pedido ped: lista){
                escribir.append(ped.getComprador()+"\n");
                escribir.append(ped.getDireccion()+"\n");
                escribir.append(ped.getMarca()+"\n");
                escribir.append(ped.getPrecio()+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error guardando los datos en el fichero");
        }
    }

}
