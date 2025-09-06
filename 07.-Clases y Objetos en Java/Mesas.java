public class Mesas extends Muebles{
    private int numeroSillas;

    public Mesas(int numeroSillas, int precio, int pesoKilos) {
        super(precio, pesoKilos);
        this.numeroSillas = numeroSillas;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public int extraCoste (){
        return this.getNumeroSillas()*10;
    }

}
