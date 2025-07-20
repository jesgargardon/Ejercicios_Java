import java.util.Scanner;

public class DivisoresExactos {

    public static void main(String[] args) {
        
        Scanner sc1= new Scanner(System.in);
        System.out.println("Por favor, introduce un numero entre 1 y 1000");
        int num = sc1.nextInt();
        for (int i=1; i<1001;i++){
            if (num%i==0){
                System.out.println("El numero "+num+" es divisible por "+i);
            }
        }
    }
}
