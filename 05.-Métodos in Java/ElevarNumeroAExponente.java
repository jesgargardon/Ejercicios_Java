import java.util.Scanner;
public class ElevarNumeroAExponente {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Introduce la base (0 a 11): ");
        int base = sc1.nextInt();
        System.out.println("Introduce el exponente (1 a 4): ");
        int exp = sc2.nextInt();
        if (base>0 && base <11 && exp>0 && exp<5){
            System.out.println ("Los valores estan dentro de rango");
            System.out.println ("La base: "+ base + "  ------ El exponente: "+ exp);
            System.out.println (" El resultado es "+baseExponente (base,exp));
        }else {
            System.out.println("Al menos uno de los valores está fuera de rango");
        }
        sc1.close();sc2.close();
    }
    private static int baseExponente (int b, int e){
        int result = 1;
        for (int i=1;i<=e;i++){
            result = result * b;
        }
        return result;
    }
}
