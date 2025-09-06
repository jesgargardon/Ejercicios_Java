import java.util.Scanner;
public class NumeroVecesLetraEnTexto_v1 {
    public static void main(String[] args) {
        Scanner lector1=new Scanner(System.in);
        Scanner lector2=new Scanner(System.in);
        System.out.println("introduce un texto:");
        String txt = lector1.nextLine();
        System.out.println("introduce una letra:");
        String ch = lector2.next();
        int len = txt.length();
        int cont=0;
        for (int i=0;i<len;i++){
            if (txt.charAt(i)==ch.charAt(0)){
                cont++;
            }
        }
        System.out.println("La letra "+ch.charAt(0)+" aparece "+cont+" veces");
        lector1.close();
        lector2.close();
    }

}
