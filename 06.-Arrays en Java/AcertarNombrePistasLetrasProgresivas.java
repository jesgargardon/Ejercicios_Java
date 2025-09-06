import java.util.Scanner;
public class AcertarNombrePistasLetrasProgresivas {
    public static void main(String[] args) {
        final String nombre = "Eustaquio";
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        System.out.println("¡Adivina el nombre!");
        while (true) {
            System.out.print("Introduce un nombre: ");
            String intento = scanner.nextLine();
            intentos++;
            if (intento.equals(nombre)) {
                System.out.println("¡Correcto! Has adivinado el nombre " + nombre + " en " + intentos + " intentos.");
                break;
            } else {
                if (intentos <= nombre.length()) {
                    String pista = nombre.substring(0, intentos);
                    System.out.println("Pista: " + pista);
                } else {
                    System.out.println("¡Incorrecto! Sigue intentándolo.");
                }
            }
        }
    }
}
