public class Ropa {
    private int talla;
    private String marca;
    private int precio;

    public Ropa(int talla, String marca, int precio) {
        this.talla = talla;
        this.marca = marca;
        this.precio = precio;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
