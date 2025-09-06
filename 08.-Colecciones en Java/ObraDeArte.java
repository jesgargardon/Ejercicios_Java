public class ObraDeArte {
    private String titulo;
    private String artista;
    private int anioCreacion;
    private double precio;

    public ObraDeArte(String titulo, String artista, int anioCreacion, double precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.anioCreacion = anioCreacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Año de creación: " + anioCreacion + ", Precio: €" + precio;
    }
}
