import java.util.Scanner;

public class LetraFrecuente {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitamos al usuario ingresar una cadena de caracteres
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = entrada.nextLine();

        // Convertimos la cadena a minúsculas para simplificar el conteo
        cadena = cadena.toLowerCase();

        // Declaramos un arreglo de tamaño 26 para almacenar el número de apariciones de cada letra del alfabeto
        int[] frecuencias = new int[26];

        // Contamos la frecuencia de cada letra en la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra >= 'a' && letra <= 'z') {  // Solo contamos las letras del alfabeto
                int indice = letra - 'a';  // Convertimos la letra a un índice numérico en el arreglo
                frecuencias[indice]++;
            }
        }

        // Encontramos la letra con mayor frecuencia
        int maxFrecuencia = 0;
        char letraFrecuente = ' ';
        for (int i = 0; i < 26; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                letraFrecuente = (char) ('a' + i);  // Convertimos el índice numérico a la letra correspondiente
            }
        }

        // Imprimimos la letra con mayor frecuencia
        System.out.println("La letra que aparece con mayor frecuencia es: " + letraFrecuente);

        entrada.close();
    }
}

