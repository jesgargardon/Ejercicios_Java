import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitamos la dimensión de la matriz
        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = entrada.nextInt();

        // Declaramos las matrices a utilizar
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] matrizResultado = new int[filas][columnas];

        // Solicitamos al usuario ingresar los valores de la primera matriz
        System.out.println("Ingrese los valores de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = entrada.nextInt();
            }
        }

        // Solicitamos al usuario ingresar los valores de la segunda matriz
        System.out.println("Ingrese los valores de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = entrada.nextInt();
            }
        }

        // Sumamos las dos matrices ingresadas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimimos la matriz resultado
        System.out.println("La matriz resultado es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}

