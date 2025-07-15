import java.util.Scanner;

public class AcertarNumero {


    public static void main(String[] args) {
        int intentos = 0;
        int valor=500;
        int introducido;
        boolean acertado = false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Tienes que acertar un número entre 1 y 1000");
        do{
            System.out.println("Introduce un numero: ");
            introducido = sc.nextInt();
            if (introducido == valor){
                acertado = true;
                System.out.println("Enhorabuena, has acertado el número. Te ha llevado "+ intentos +" intentos.");
            }
            else if (introducido<valor){
                intentos++;
                System.out.println("El numero introducido es menor que el que tienes que acertar");
                System.out.println("Llevas "+intentos+" intentos. Sigue probando");
            }else{
                intentos++;
                System.out.println("El numero introducido es mayor que el que tienes que acertar");
                System.out.println("Llevas "+intentos+" intentos. Sigue probando");
            }
        }while(!acertado);
    }
    
}
