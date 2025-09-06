public class Libreria extends Mueble{
    private int numeroBaldas;
    private boolean tieneCajones;

    public Libreria(int numeroBaldas, boolean tieneCajones, String descripcion, int precio) {
        super(descripcion, precio);
        this.numeroBaldas = numeroBaldas;
        this.tieneCajones = tieneCajones;
    }

    public boolean isTieneCajones() {
        return tieneCajones;
    }

    public void setTieneCajones(boolean tieneCajones) {
        this.tieneCajones = tieneCajones;
    }

    public int getNumeroBaldas() {
        return numeroBaldas;
    }

    public void setNumeroBaldas(int numeroBaldas) {
        this.numeroBaldas = numeroBaldas;
    }

    public void imprimir (){
        System.out.println("****** Datos de la Libreria *********");
        System.out.println("Descripción: "+ this.descripcion);
        System.out.println("Precio: "+ this.precio);
        System.out.println("Numero de baldas: "+ this.numeroBaldas);
        System.out.println("Tiene cajones?: "+ this.tieneCajones);
    }
}
