public class Planeta {
    private double añosLuz;

    public Planeta(double distanciaKM) {
        this.añosLuz = distanciaKM;
    }

    public double getAñosLuz() {
        return añosLuz;
    }

    public void setAñosLuz(double añosLuz) {
        this.añosLuz = añosLuz;
    }
    
    public double diasDeViaje(){
        return añosLuz/10;
    }
}
