import java.util.Scanner;

public class RemplazarVocalesPorInterrogacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        frase = frase.replaceAll("[aeiouAEIOU]", "?");
        System.out.println("La cadena con las vocales reemplazadas es: " + frase);
    }
}
