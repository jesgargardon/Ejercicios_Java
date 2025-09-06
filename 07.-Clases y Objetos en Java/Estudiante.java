public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String carrera, String nombre, int añoNacimiento) {
        super(nombre, añoNacimiento);
        this.carrera = carrera;
    }
    public void dibujarDatos(){
        System.out.println("El nombre del estudiante es: "+this.getNombre());
        System.out.println("Nacio en el año: "+this.getAñoNacimiento());
        System.out.println("Y está estudiando la carrera: "+this.carrera);
    }
}
