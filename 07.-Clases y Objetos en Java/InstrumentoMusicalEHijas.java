class InstrumentoMusical {
    String nombre;
    String tipo;
    double precio;

    public InstrumentoMusical(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
}

class Guitarra extends InstrumentoMusical {
    int numeroCuerdas;

    public Guitarra(String nombre, String tipo, double precio, int numeroCuerdas) {
        super(nombre, tipo, precio);
        this.numeroCuerdas = numeroCuerdas;
    }
}

class Piano extends InstrumentoMusical {
    int numeroTeclas;

    public Piano(String nombre, String tipo, double precio, int numeroTeclas) {
        super(nombre, tipo, precio);
        this.numeroTeclas = numeroTeclas;
    }
}


public class InstrumentoMusicalEHijas {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("Fender Stratocaster", "Cuerda", 1500.0, 6);
        Piano piano = new Piano("Yamaha U3", "Tecla", 5000.0, 88);

        System.out.println("Nombre: " + guitarra.nombre);
        System.out.println("Tipo: " + guitarra.tipo);
        System.out.println("Precio: " + guitarra.precio);
        System.out.println("Número de cuerdas: " + guitarra.numeroCuerdas);

    }
}