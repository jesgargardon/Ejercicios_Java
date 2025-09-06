public class Coche {
    private String matricula;
    private String modelo;
    private boolean operativo;
    private String conductorAsignado;

    public Coche(String matricula,String modelo, boolean operativo, String conductorAsignado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.operativo = operativo;
        this.conductorAsignado = conductorAsignado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isOperativo() {
        return operativo;
    }

    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }

    public String getConductorAsignado() {
        return conductorAsignado;
    }

    public void setConductorAsignado(String conductorAsignado) {
        this.conductorAsignado = conductorAsignado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
