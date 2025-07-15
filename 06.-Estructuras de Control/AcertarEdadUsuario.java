import java.util.Scanner;

public class AcertarEdadUsuario {


    public static void main(String[] args) {
        int intentos = 0;
        int edad;
        int introducido;
       
        boolean acertado = false;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor, introduce tu edad");
        edad = sc.nextInt();
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Tienes que acertar la edad del primer usuario");
        do{
            System.out.println("Introduce una edad: ");
            introducido = sc1.nextInt();
            if (introducido == edad){
                acertado = true;
                intentos++;
                System.out.println("Enhorabuena, has acertado la edad del usuario. Te ha llevado "+ intentos +" intentos.");
            }
            else if (introducido<edad){
                intentos++;
                System.out.println("El numero introducido es menor que la edad del usuario");
                System.out.println("Llevas "+intentos+" intentos. Sigue probando");
            }else{
                intentos++;
                System.out.println("El numero introducido es mayor que la edad del usuario");
                System.out.println("Llevas "+intentos+" intentos. Sigue probando");
            }
        }while(!acertado);
    }
    
}
