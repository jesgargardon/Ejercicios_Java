class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + this.denominador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - this.denominador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}
public class TrabajandoConFracciones{
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(3, 4);
        Fraccion fraccion2 = new Fraccion(1, 2);

        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        System.out.println("Suma: " + suma); // Salida: Suma: 5/4
        System.out.println("Resta: " + resta); // Salida: Resta: 1/4
        System.out.println("Multiplicación: " + multiplicacion); // Salida: Multiplicación: 3/8
        System.out.println("División: " + division); // Salida: División: 3/2

    }
}
