import java.util.Scanner;
public class EbookLibroFisico {
    public static void main(String[] args) {
       Scanner lector1 = new Scanner(System.in);
       System.out.println("Introduce el nombre del libro: ");
       String Titulo = lector1.nextLine();
       Scanner lector2 = new Scanner(System.in);
       System.out.println("Introduce el nombre del autor: ");
       String Autor = lector2.nextLine();
       Scanner lector3 = new Scanner(System.in);
       System.out.println("Introduce el precio del libro: ");
       int Precio = lector3.nextInt();
       Scanner lector4 = new Scanner(System.in);
       System.out.println("Introduce el numero de personas que tienen Ebook: ");
       int Personas = lector4.nextInt();
       Scanner lector5 = new Scanner(System.in);
       System.out.println("Introduce el numero de ventas de libros fisicos: ");
       int Ventas = lector5.nextInt();

       Ebook ebook = new Ebook(Personas, Titulo, Autor, Precio);
       ebook.dibujarDatos();
       System.out.println (" El Ebook: " + ebook.getTitulo() + " con autor " + ebook.getAutor() + " cuesta " + ebook.getPrecio());

       LibroFisico librofisico = new LibroFisico(Ventas, Titulo, Autor, Precio);
       librofisico.dibujarDatos();
       System.out.println (" El Libro Físico: " + librofisico.getTitulo() + " con autor " + librofisico.getAutor() + " cuesta " + librofisico.getPrecio());
       lector1.close();lector2.close();lector3.close();lector4.close();lector5.close();
    }
}