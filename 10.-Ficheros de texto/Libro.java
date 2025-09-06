public class Libro {
    private String titulo;
    private String autor;
    private String prestado;

    public Libro(String titulo, String autor, String prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", prestado=" + prestado + '}';
    }
    
    
}
