import java.util.Scanner;

public class TomarNotasMenus {
    public static void main(String[] args) {
        int numeroComensales;
        int[] menus;
        Scanner sc1 = new Scanner(System.in);
//introducción del número de comensales
        do{
            System.out.println("Introduce el número de comensales (máximo 5):");
            numeroComensales = sc1.nextInt();
        }while(numeroComensales<1 || numeroComensales>5);
//introducción de los menus para cada comensal
        menus = new int[numeroComensales];
        for(int i=0;i<numeroComensales;i++){
            System.out.println("Introduce el menu pedido por el comensal "+(i+1)+" :");
            menus[i]=sc1.nextInt();
        }
//dibujando en pantalla los menus tomados por cada comensal
        for (int i= 0; i<numeroComensales;i++){
            System.out.println("Comensal "+(i+1)+" va a tomar el menu "+menus[i]);
        }
    }

}
