public class Pais {
    private String nombre;
    private long población;
    private double PIB;

    //Constructores
    public Pais(String nombre, long población, double PIB) {
        this.nombre = nombre;
        this.población = población;
        this.PIB = PIB;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getPoblación() {
        return población;
    }
    public void setPoblación(long población) {
        this.población = población;
    }
    public double getPIB() {
        return PIB;
    }
    public void setPIB(double PIB) {
        this.PIB = PIB;
    }
    // métodos
    public double PIBPerCapita(){
    return (this.PIB*1000000)/this.población;
    }
}
