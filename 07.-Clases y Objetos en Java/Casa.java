public class Casa {
    private double metrosCuadrados;
    private boolean jardin;
    
//constructores
    public Casa(double metrosCuadrados, boolean jardin) {
        this.metrosCuadrados = metrosCuadrados;
        this.jardin = jardin;
    }
//métodos
    public double precio (){
        double pr=metrosCuadrados*1000;
        if (jardin){
            pr=pr+5000;
        }
        return pr;
    }
//métodos getters y setters
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public boolean isJardin() {
        return jardin;
    }
    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }
}
