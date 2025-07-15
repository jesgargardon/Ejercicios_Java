import java.util.Scanner;

public class SumaPrimerosNnumerosNaturales_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un número entero positivo N: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Por favor, introduce un número entero positivo.");
            }
        } while (n <= 0);
        // Calculamos la suma de los primeros N números naturales
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Resultado = " + suma);

    }
}