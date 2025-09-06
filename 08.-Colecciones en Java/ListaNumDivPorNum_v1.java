import java.util.ArrayList;
import java.util.Scanner;
public class ListaNumDivPorNum_v1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int div;
        do{
            System.out.println("Introduce un número entero comprendido entre 2 y 7");
            div=sc.nextInt();
        }while(div<2 || div >7);
               
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=div;i<101;i=i+div){
            numeros.add(i);
        }
        System.out.println("La lista de numeros del 1 al 100 divisible por "+div+" es:");
        System.out.println(numeros);
    }
}
