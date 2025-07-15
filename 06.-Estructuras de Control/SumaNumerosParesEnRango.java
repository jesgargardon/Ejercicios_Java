import java.util.Scanner;

public class SumaNumerosParesEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        int sumaPares = 0;
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        System.out.println("Resultado = " + sumaPares);
    }
}