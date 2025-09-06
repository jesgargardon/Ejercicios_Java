import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionLibrosBiblioteca {

        public static void main(String[] args) {
        File fichero = new File("biblioteca.txt");
        boolean salir = false;
        int eleccion = 0;
        ArrayList<Libro>listaLibros = new ArrayList<>();
        Libro lib = null;
        
        if (fichero.exists()){
           System.out.println("Cargados datos");
           listaLibros=cargarDatos(fichero);
       }else{
            System.out.println("El fichero no se encuentra en la ubicación indicada");
            salir=true;
        }               
        while(!salir){
            presentarMenus();
            eleccion=introducirOpcion();
            switch (eleccion){
                case 1:
                    tituloEncontrado(listaLibros);
                    break;
                case 2:
                    autorEncontrado(listaLibros);
                    break;
                case 3:
                    listadoLibros(listaLibros);
                case 4:
                    listadoPrestados(listaLibros);
                    break;
                case 5:
                    salir=true;
                    break;
            }       
        }
    }
    
    public static ArrayList<Libro> cargarDatos(File fich){
        ArrayList<Libro>listaDeLibros = new ArrayList<>();
        int contador = 0;
        String linea;
        String titulo="";
        String autor="";
        String ubicacion="";
        try {
            Scanner sc = new Scanner(fich);
            while (sc.hasNext()){
                linea = sc.nextLine();
                contador++;
                switch(contador){
                    case 1:
                        titulo=linea;
                    break;
                    case 2:
                        autor=linea;
                    break;
                    case 3:
                        ubicacion=linea;
                        contador=0;
                    break;
                }
            if (contador==0){
                Libro lib= new Libro(titulo, autor, ubicacion);
                listaDeLibros.add(lib);
            }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: "+ex);
        }
        return listaDeLibros;
    }
    
    public static void presentarMenus(){
        System.out.println("------------------------");
        System.out.println("PROGRAMA RESERVA EN RESTAURANTE");
        System.out.println("------------------------");
        System.out.println("1.- Busqueda por titulo");
        System.out.println("2.- Busqueda por autor");
        System.out.println("3.- Listado de libros y su ubicación");
        System.out.println("4.- Listado de libros prestados");
        System.out.println("5.- Salir");
    }
 
    public static int introducirOpcion(){
        boolean valida= false;
        int opcion=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la opción deseada");
        while(!valida){
            opcion = entrada.nextInt();
            if (opcion>0 && opcion<6){
                valida=true;
            }else{
                System.out.println("OPCION INCORRECTA");
                System.out.println("La opción elegida tiene que estar entre 1 y 5");
                System.out.println("Por favor, introduce opción correcta");
            }
        }
        return opcion;
    }
    public static void tituloEncontrado (ArrayList<Libro>listaLibros){
        System.out.println("Introduce el titulo a buscar:");
        boolean encontrado=false;
        System.out.println("BUSQUEDA DE LIBRO POR TITULO");
        System.out.println("-----------------------------");
        Scanner ent = new Scanner(System.in);
        String titulo = ent.nextLine();
        for (Libro lib: listaLibros){
            if (lib.getTitulo().equals(titulo)){
                System.out.println("Libro encontrado: "+"\n"+lib.toString());
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("Libro NO encontrado");
        }
        
    }
        public static void autorEncontrado (ArrayList<Libro>listaLibros){
        System.out.println("Introduce el autor a buscar:");
        int contador=0;
        System.out.println("BUSQUEDA DE LIBROS POR AUTOR");
        System.out.println("-----------------------------");
        Scanner ent = new Scanner(System.in);
        String autor = ent.nextLine();
        for (Libro lib: listaLibros){
            if (lib.getAutor().equals(autor)){
                System.out.println("Libro encontrado: "+"\n"+lib.toString());
                contador++;
            }
        }
        if (contador==0){
            System.out.println("Autor NO encontrado");
        }else{
            System.out.println("Se han encontrado "+contador+" libros del autor "+autor);
        }
        
    }
    public static void listadoPrestados(ArrayList<Libro>listaLibros){
        System.out.println("LISTADO DE LIBROS EN PRESTAMO");
        System.out.println("-----------------------------");
        String prestado="biblioteca";
        for (Libro lib: listaLibros){
            if (!lib.getPrestado().equals(prestado)){
                System.out.println(lib.toString());
            }
        }
    }

    public static void listadoLibros(ArrayList<Libro>listaLibros){
        System.out.println("LISTADO COMPLETO DE LIBROS");
        System.out.println("-----------------------------");
        String prestado="biblioteca";
        for (Libro lib: listaLibros){
            System.out.println(lib.toString());
        }
    }
}
