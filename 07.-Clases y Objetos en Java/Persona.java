public class Persona {
    private String nombre;
    private int añoNacimiento;
//constructor
    public Persona(String nombre, int añoNacimiento) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
    }
//getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
//métodos
    public int edad(int añoActual){
        return añoActual-this.añoNacimiento;
    }
}
