import java.util.Scanner;

public class SumaPrimerosNnumerosNaturales_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo N: ");
        int n = scanner.nextInt();
        // Validamos que el número sea positivo
        if (n <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
            return;
        }
        // Calculamos la suma de los primeros N números naturales
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Resultado = " + suma);
    }
}