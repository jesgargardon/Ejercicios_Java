import java.util.Scanner;
public class AcertarPalabraConPista {
    public static void main(String[] args) {
        int longitudPalabra;
        // Palabra secreta hardcodeada
        String palabraSecreta = "cable";

        Scanner scanner = new Scanner(System.in);
        String palabraIntroducida;
        System.out.println("Adivina la palabra secreta:");
        while (true) {
            System.out.print("Introduzca una palabra: ");
            palabraIntroducida = scanner.nextLine();
            if (palabraIntroducida.equals(palabraSecreta)) {
                System.out.println("¡Correcto! Has adivinado la palabra secreta");
                break;
            } else {
                // Mostrar pista
                longitudPalabra = palabraSecreta.length();
                String pista = "Correctas: ";
                for (int i = 0; i < palabraIntroducida.length() && i < palabraSecreta.length(); i++) {
                    if (palabraIntroducida.charAt(i) == palabraSecreta.charAt(i)) {
                        pista += palabraIntroducida.charAt(i);
                    } else {
                        break;
                    }
                }
                System.out.println("Pista: La palabra tiene " + longitudPalabra + " letras. " + pista);
            }
        }
        scanner.close();
    }
}
