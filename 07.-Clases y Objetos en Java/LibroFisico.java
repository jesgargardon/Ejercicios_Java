public class LibroFisico extends Libro{
    int Ventas;
    public LibroFisico (int Ventas, String Titulo, String Autor, int Precio) {
        super (Titulo, Autor, Precio);
        this.Ventas = Ventas;
    }
    public void dibujarDatos() {
        System.out.println("El nombre del Libro es: " + this.getTitulo());
        System.out.println("El nombre del autor es: " + this.getAutor());
        System.out.println("Su precio es: " + this.getPrecio());
        System.out.println("El numero de ventas que hay es: " + this.Ventas);

    }
}
