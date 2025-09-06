import java.util.Scanner;
public class ClasesBarcoMotora {
    public static void main(String[] args) {
        System.out.println("Introduce la manga de la motora");
        Scanner sc = new Scanner(System.in);
        double manga = sc.nextDouble();
        System.out.println("Introduce la eslora de la motora");
        Scanner sc1 = new Scanner(System.in);
        double eslora = sc.nextDouble();
        System.out.println("Introduce la potencia en CV de la motora");
        Scanner sc3 = new Scanner(System.in);
        double CV = sc.nextDouble();
        System.out.println("Introduce la distancia que quieres navegar en Millas marinas");
        Scanner sc4 = new Scanner(System.in);
        double millas = sc.nextDouble();
        
        Motora mimotora = new Motora(CV,eslora,manga);
        System.out.println("La motora con las siguientes características:");
        mimotora.datos();
        System.out.println("Necesita "+mimotora.litros(millas)+" litros, para recorrer "+millas+" millas marinas");
        
    }
    
}
