import java.util.Scanner;
public class PalabraInicialesDeLasPalabrasTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        // Dividir el texto en palabras usando el espacio como delimitador
        String[] palabras = texto.split(" ");

        // Crear la palabra con las iniciales de las palabras del texto
        StringBuilder palabraIniciales = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) { // Ignorar espacios en blanco
                palabraIniciales.append(palabra.charAt(0));
            }
        }
        System.out.println("Palabra con iniciales: " + palabraIniciales);
    }
}
