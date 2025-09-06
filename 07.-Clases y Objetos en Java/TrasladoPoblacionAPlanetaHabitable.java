import java.util.Scanner;
public class TrasladoPoblacionAPlanetaHabitable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double distancia,poblacion,capacidadNave;
        System.out.println("¿A cuantos años luz de distancia se encuentra el planeta?");
        distancia= sc.nextDouble();
        System.out.println("¿Qué población admite el planeta?");
        poblacion=sc.nextDouble();
        System.out.println("¿Qué capacidad tiene una nave?");
        capacidadNave=sc.nextDouble();
        PlanetaHabitable destino = new PlanetaHabitable (poblacion, distancia);
        System.out.println("Tardamos "+destino.diasDeViaje()+" dias de viaje en alcanzar el planeta");
        System.out.println("Necesitamos "+destino.NumeroNaves(capacidadNave)+" naves para alcanzar el planeta");
    }
    
}
