import java.util.Scanner;
public class CalculoPrecioCasa {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Por favor, introduce los metros cuadrados de tu casa: ");
        double m2=sc1.nextDouble();
        System.out.println("La casa, tiene jardin? (true/false)");
        boolean tieneJardin = sc2.nextBoolean();
        Casa casa1 = new Casa (m2, tieneJardin);
        System.out.println("El precio de la casa es: "+casa1.precio());
        sc1.close();sc2.close();
    }
}   

