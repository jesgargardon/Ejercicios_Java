public class Empleado {
    private String nombre;
    private String direccion;
    private int añosAntiguedad;
    private int salario;

    public Empleado(String nombre, String direccion, int añosAntiguedad, int salario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.añosAntiguedad = añosAntiguedad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void datosEmpleado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("Antigüedad: "+this.añosAntiguedad);
        System.out.println("Salario: "+this.salario);
    
    }
}
