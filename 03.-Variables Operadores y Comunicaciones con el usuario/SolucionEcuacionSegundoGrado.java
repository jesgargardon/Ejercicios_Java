import java.util.Scanner;
public class SolucionEcuacionSegundoGrado {
    public static void main(String[] args) {
        double a,b,c;
        double d, solucion1, solucion2;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Introduce el coeficiente de segundo grado:");
        a=sc1.nextDouble();
        System.out.println("Introduce el coeficiente de primer grado:");
        b=sc1.nextDouble();
        System.out.println("Introduce el termino independiente:");
        c=sc1.nextDouble();
        d=b*b-4*a*c;
        if (d<0){
            System.out.println("No hay soluciones reales");
        }
        else {
            solucion1=-(b+Math.sqrt(d))/(2*a);
            solucion2=-(b-Math.sqrt(d))/(2*a);
            System.out.println("la primera solución es: "+solucion1);
            System.out.println("la segunda solución es: "+solucion2);
        }
    }

}
