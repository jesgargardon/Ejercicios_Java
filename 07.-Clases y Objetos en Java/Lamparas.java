public class Lamparas extends Muebles{
    private int numeroBombillas;

    public Lamparas(int numeroBombillas, int precio, int pesoKilos) {
        super(precio, pesoKilos);
        this.numeroBombillas = numeroBombillas;
    }

    public int getNumeroBombillas() {
        return numeroBombillas;
    }

    public void setNumeroBombillas(int numeroBombillas) {
        this.numeroBombillas = numeroBombillas;
    }
    public int extracoste(){
        return this.getNumeroBombillas()*5;
    }

}
