public class Mueble {
    String descripcion;
    int precio;

    public Mueble(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public float cuotaMensual(int meses){
        return (float)this.precio/(float)meses;
    }
}
