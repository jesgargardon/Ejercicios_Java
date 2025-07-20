import java.util.Scanner;

public class CuadradosNumerosIntroducidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Introduce un número entero positivo (introduce 0 para salir): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Por favor, introduce un número entero positivo.");
            } else if (numero > 0) {
                int cuadrado = numero * numero;
                System.out.println("Número introducido: " + numero + ", Cuadrado: " + cuadrado);
            }
        } while (numero != 0);


    }
}