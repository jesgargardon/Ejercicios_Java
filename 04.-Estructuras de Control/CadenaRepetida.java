import java.util.Scanner;

public class CadenaRepetida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = sc.nextLine();
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        String cadenaRepetida = "";
        for (int i = 0; i < n; i++) {
            cadenaRepetida += cadena;
        }
        System.out.println("La cadena repetida " + n + " veces es: " + cadenaRepetida);
    }
}

