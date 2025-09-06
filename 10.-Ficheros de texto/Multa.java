public class Multa {
    private String matricula;
    private int tipo;
    private boolean pagada;

    public Multa(String matricula, int tipo, boolean pagada) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.pagada = pagada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
    
    
}
