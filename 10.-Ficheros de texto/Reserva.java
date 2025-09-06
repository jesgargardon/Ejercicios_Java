public class Reserva {
    private String dia;
    private int mesa;
    private String nombre;
    private int comensales;

    public Reserva(String dia, int mesa, String turno, int comensales) {
        this.dia = dia;
        this.mesa = mesa;
        this.nombre = turno;
        this.comensales = comensales;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    @Override
    public String toString() {
        return "Reserva{" + "dia=" + dia + ", mesa=" + mesa + ", nombre=" + nombre + ", comensales=" + comensales + '}';
    }
    
    
}
