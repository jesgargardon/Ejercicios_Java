import java.util.Scanner;

public class ContarVocalesFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        int contadorVocales = contarVocales(frase);
        System.out.println("Resultado: " + contadorVocales + " vocales");
    }

    public static int contarVocales(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
