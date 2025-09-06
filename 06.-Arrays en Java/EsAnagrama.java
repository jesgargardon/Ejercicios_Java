import java.util.Arrays;
import java.util.Scanner;

    public class EsAnagrama {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario las dos cadenas
            System.out.print("Ingresa la primera cadena: ");
            String cadena1 = scanner.nextLine().toLowerCase();

            System.out.print("Ingresa la segunda cadena: ");
            String cadena2 = scanner.nextLine().toLowerCase();

            // Verificar si son anagramas
            if (esAnagrama(cadena1, cadena2)) {
                System.out.println("Las cadenas son anagramas");
            } else {
                System.out.println("Las cadenas no son anagramas");
            }

            scanner.close();
        }

        // Método para verificar si dos cadenas son anagramas
        public static boolean esAnagrama(String cadena1, String cadena2) {
            // Convertir las cadenas a arreglos de caracteres y ordenarlos
            char[] arreglo1 = cadena1.toCharArray();
            char[] arreglo2 = cadena2.toCharArray();
            Arrays.sort(arreglo1);
            Arrays.sort(arreglo2);

            // Verificar si los arreglos son iguales
            return Arrays.equals(arreglo1, arreglo2);
        }
    }
