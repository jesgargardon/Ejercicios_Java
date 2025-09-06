public class Zapato extends Ropa {
    private boolean conCordones;

    public Zapato(boolean conCordones, int talla, String marca, int precio) {
        super(talla, marca, precio);
        this.conCordones = conCordones;
    }
    public boolean isConCordones() {
        return conCordones;
    }
    public void setConCordones(boolean conCordones) {
        this.conCordones = conCordones;
    }
    public void datosZapato(){
        System.out.println("Datos del Zapato");
        System.out.println("-----------------");
        System.out.println("talla: "+this.getTalla());
        System.out.println("marca: "+this.getMarca());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("Con cordones? "+this.isConCordones());
    }

}
