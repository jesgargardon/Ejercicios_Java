import java.util.Scanner;
public class NumeroDivisoresPrimos {
    static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;
        if (num < 2) {
            primo = false;
        }
        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }
    static int numDivisoresPrimos(int num) {
        int cont = 0;

        for (int i = 2; i <= num; i++) {
            if (esPrimo(i) && num % i == 0) {
                System.out.println("Divisor:" + i);
                cont++;
            }
        }
        return (cont);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Divisores primos de "+ n + ": " + numDivisoresPrimos(n));
    }
}