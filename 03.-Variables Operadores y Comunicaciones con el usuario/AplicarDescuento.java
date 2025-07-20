import java.util.Scanner;
public class AplicarDescuento {
    public static void main(String[] args) {

        double descuento, cantidad, precio;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        precio=sc.nextDouble();
        System.out.println("Indica cuantas unidades quieres comprar");
        cantidad=sc.nextDouble();
        System.out.println("Indica el descuento que te dan (0-100)");
        descuento=sc.nextDouble();
        System.out.println("Has comprado "+cantidad+" unidades con un descuento de "+descuento);
        System.out.println("Has pagado: "+(cantidad*precio*(1-descuento/100)));
        System.out.println("Te has ahorrado: "+(cantidad*precio*descuento/100));
    }

}
