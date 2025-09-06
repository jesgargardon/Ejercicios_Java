import java.util.Scanner;

public class IntroducirPalabraHastaSalir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "";
        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("Por favor introduzca una palabra: ");
            palabra = scanner.nextLine();
        }
        System.out.println("Programa terminado.");
    }
}

    

    
