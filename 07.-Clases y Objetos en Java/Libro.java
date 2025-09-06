public class Libro {
    String Titulo;
    String Autor;
    int Precio;
    public Libro (String Titulo, String Autor, int Precio) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
    }
    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setTitulo (String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
}
