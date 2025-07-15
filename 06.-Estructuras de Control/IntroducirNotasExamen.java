
import java.util.Scanner;

public class IntroducirNotasExamen {

    public static void main(String[] args) {
        int numeroAlumnos, nota;
        int numAprobados=0,sumaNotas=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de alumnos del examen");
        numeroAlumnos= sc.nextInt();
        int contador = numeroAlumnos;
        while(contador>0){
            contador=contador-1;
            System.out.println("Introduce nota del alumno nº:"+(numeroAlumnos-contador));
            nota = sc.nextInt();
            sumaNotas=sumaNotas+nota;
            if (nota>=5){
                numAprobados++;
            }
        }
        System.out.println("Resultados del examen:");
        System.out.println("-----------------------");
        System.out.println("El número de aprobados es: "+numAprobados);
        System.out.println("El número de suspensos es: "+(numeroAlumnos-numAprobados));
        System.out.println("La media de las notas es: "+(sumaNotas/numeroAlumnos));
    }
    
}
