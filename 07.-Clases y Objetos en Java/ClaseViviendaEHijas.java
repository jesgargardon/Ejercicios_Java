import java.util.Scanner;

class Vivienda {
    int añoConstruccion;
    double metrosCuadrados;
    double precio;

    public Vivienda(int añoConstruccion, double metrosCuadrados, double precio) {
        this.añoConstruccion = añoConstruccion;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }
}

class Chalet extends Vivienda {
    boolean piscina;

    public Chalet(int añoConstruccion, double metrosCuadrados, double precio, boolean piscina) {
        super(añoConstruccion, metrosCuadrados, precio);
        this.piscina = piscina;
    }

    public double calcularMaximaHipoteca() {
        if (piscina) {
            return 0;
        } else {
            return precio / metrosCuadrados * 100;
        }
    }
}

public class ClaseViviendaEHijas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el año de construcción del chalet: ");
        int añoConstruccion = scanner.nextInt();

        System.out.print("Introduce los metros cuadrados habitables del chalet: ");
        double metrosCuadrados = scanner.nextDouble();

        System.out.print("Introduce el precio del chalet: ");
        double precio = scanner.nextDouble();

        System.out.print("¿El chalet tiene piscina? (true/false): ");
        boolean piscina = scanner.nextBoolean();

        Chalet chalet = new Chalet(añoConstruccion, metrosCuadrados, precio, piscina);

        double maximaHipoteca = chalet.calcularMaximaHipoteca();
        System.out.println("Máximo de hipoteca para este chalet: " + maximaHipoteca);


    }
}