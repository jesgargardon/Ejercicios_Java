public class MuebleLibreria {
    public static void main(String[] args) {
        Libreria MiLibreria = new Libreria(5,true,"libreria de madera",60);
        System.out.println("Cuota mensual a pagar: "+MiLibreria.cuotaMensual(6));
        MiLibreria.imprimir();

    }
}