import java.util.Scanner;
public class CalculoAreaVolumenCilindro {
    static void areaVolumenCilindro(double radio, double altura, int opcion) {
        double volumen, area;

        switch (opcion) {
            case 1 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen es de: " + volumen);
            }
            case 2 -> {
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El área es de: " + area);
            }
            default -> System.out.println("Indicador del cálculo erróneo");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca radio: ");
        double radio = sc.nextDouble();
        System.out.print("Introduzca altura: ");
        double alt = sc.nextDouble();
        System.out.print("Qué desea calcular (1 volumen/2 área): ");
        int tipoCalculo = sc.nextInt();
        sc.close();
        System.out.println();
        areaVolumenCilindro(radio, alt, tipoCalculo);
    }
}
