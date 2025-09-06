import java.util.Scanner;
public class PromedioNumerosIntroducidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        // Bucle para pedir números al usuario hasta que introduzca un 0
        while (true) {
            System.out.print("Introduce un número entero positivo (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero == 0) {
                break; // Sale del bucle si el número introducido es 0
            } else if (numero > 0) {
                suma += numero;
                contador++;
            }
        }
        // Cálculo del promedio
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números introducidos es: " + promedio);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
        // cierre del objeto Scanner
        scanner.close();
    }

}
