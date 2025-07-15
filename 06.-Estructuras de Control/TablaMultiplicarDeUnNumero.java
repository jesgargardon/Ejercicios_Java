import java.util.Scanner;
public class TablaMultiplicarDeUnNumero {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero entre 1 y 9");
        int num = sc1.nextInt();
        for (int i=1;i<10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }

}
