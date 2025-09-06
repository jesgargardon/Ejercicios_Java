import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print("Los primeros " + n + " términos de la serie de Fibonacci son: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
