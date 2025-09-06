public class Motora extends Barco {
    private double Potencia_CV;

    public Motora(double Potencia_CV, double eslora, double manga) {
        super(eslora, manga);
        this.Potencia_CV = Potencia_CV;
    }

    public double getPotencia_CV() {
        return Potencia_CV;
    }

    public void setPotencia_CV(double Potencia_CV) {
        this.Potencia_CV = Potencia_CV;
    }

    public double litros(double millas){
        return ((this.getEslora()+this.getManga())/this.getPotencia_CV())*millas;
    }
    public void datos(){
    System.out.println("Eslora = "+this.getEslora());
    System.out.println("Manga = "+this.getManga());
    System.out.println("Potencia = "+this.getPotencia_CV()+" CV");
    }
}
