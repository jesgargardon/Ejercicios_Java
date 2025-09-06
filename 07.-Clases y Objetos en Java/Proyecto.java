public class Proyecto {
    private String descripcion;
    private int duracion;
    private int tarifaDiaria;

    public Proyecto(String descripcion, int duracion, int tarifaDiaria) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.tarifaDiaria = tarifaDiaria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getTarifaDiaria() {
        return tarifaDiaria;
    }
    public void setTarifaDiaria(int tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }
    public int dineroGanado(){
        return this.getDuracion()*this.getTarifaDiaria();
    }
}
