import java.util.Scanner;
public class RopaZapato {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        Scanner sc4 = new Scanner (System.in);

        int talla;
        String marca;
        int precio;
        boolean conCordones;

        System.out.println("Introduce la talla del Zapato");
        talla = sc1.nextInt();
        System.out.println("Introduce la marca del Zapato");
        marca = sc2.nextLine();
        System.out.println("Introduce el precio del Zapato");
        precio = sc3.nextInt();
        System.out.println("¿Tiene cordones el zapato? (true/false)");
        conCordones = sc4.nextBoolean();

        Zapato zapatoIntroducido = new Zapato(conCordones,talla, marca, precio);
        zapatoIntroducido.datosZapato();
    }

}