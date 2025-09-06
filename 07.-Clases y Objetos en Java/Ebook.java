public class Ebook extends Libro {
    int Personas;
    public Ebook (int Personas, String Titulo, String Autor, int Precio) {
        super (Titulo, Autor, Precio);
        this.Personas = Personas;
    }
    public void dibujarDatos() {
        System.out.println("El nombre del Libro es: " + this.getTitulo());
        System.out.println("El nombre del autor es: " + this.getAutor());
        System.out.println("Su precio es: " + this.getPrecio());
        System.out.println("El numero de personas que lo compra es: " + this.Personas);

    }
}
