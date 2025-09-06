import java.util.Scanner;

public class InvertirCadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String Cadena = scanner.nextLine();
        String cadenaInvertida = invertirCadena(Cadena);
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
    public static String invertirCadena(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }
}
