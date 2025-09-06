import java.util.Scanner;

public class PuedesConducir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Qué edad tienes?");
        int edad = scan.nextInt();
        System.out.println("¿Tienes carnet de conducir?(Si/No)");
        String carnet = scan.next();

        if (edad > 17 && carnet.equalsIgnoreCase("Si")){
            System.out.println("Puedes conducir");
        }
        else {
            System.out.println("No estás autorizado para conducir");
        }
    }
}
