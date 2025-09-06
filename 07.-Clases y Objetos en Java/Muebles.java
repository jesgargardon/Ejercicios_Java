public class Muebles {
    private int precio;
    private int pesoKilos;

    public Muebles(int precio, int pesoKilos) {
        this.precio = precio;
        this.pesoKilos = pesoKilos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPesoKilos() {
        return pesoKilos;
    }

    public void setPesoKilos(int pesoKilos) {
        this.pesoKilos = pesoKilos;
    }

    @Override
    public String toString() {
        return "Muebles{" + "precio=" + precio + ", pesoKilos=" + pesoKilos + '}';
    }

}
