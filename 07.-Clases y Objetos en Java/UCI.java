public class UCI extends Habitacion{
    private String sanitario;
    private String paciente;

    public UCI(String sanitario, String paciente, int numeroHabitacion, int numeroPlanta, boolean libre) {
        super(numeroHabitacion, numeroPlanta, libre);
        this.sanitario = sanitario;
        this.paciente = paciente;
    }
    public String getSanitario() {
        return sanitario;
    }
    public void setSanitario(String sanitario) {
        this.sanitario = sanitario;
    }
    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public void dibujarDatos(){
        System.out.print("habitación número: "+this.getNumeroHabitacion()+" -- ");
        System.out.print("Planta: "+this.getNumeroPlanta()+" -- ");
        if (this.isLibre()){
            System.out.print("La UCI está disponible -- ");
        }else{
            System.out.print("La UCI está ocupada -- ");
        }
        System.out.print("Sanitario al cargo: "+this.sanitario+" -- ");
        System.out.println("Paciente: "+this.paciente+" -- ");
    }
}
