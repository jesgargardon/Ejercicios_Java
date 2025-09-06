public class Habitacion {
    private int numeroHabitacion;
    private int numeroPlanta;
    private boolean libre;

    public Habitacion(int numeroHabitacion, int numeroPlanta, boolean libre) {
        this.numeroHabitacion = numeroHabitacion;
        this.numeroPlanta = numeroPlanta;
        this.libre = libre;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
    
}
