public class PlanetaHabitable extends Planeta {
    private double CapacidadPobladoresEnMillones;

    public PlanetaHabitable(double CapacidadPobladoresEnMillones, double distanciaKM) {
        super(distanciaKM);
        this.CapacidadPobladoresEnMillones = CapacidadPobladoresEnMillones;
    }

    public double getCapacidadPobladoresEnMillones() {
        return CapacidadPobladoresEnMillones;
    }

    public void setCapacidadPobladoresEnMillones(double CapacidadPobladoresEnMillones) {
        this.CapacidadPobladoresEnMillones = CapacidadPobladoresEnMillones;
    }
    
    public double NumeroNaves(double CapacidadNave){
        return (int)(CapacidadPobladoresEnMillones/CapacidadNave)+1;
    }
}
