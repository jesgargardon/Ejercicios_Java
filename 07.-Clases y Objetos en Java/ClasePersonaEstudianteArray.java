import java.util.Scanner;

public class ClasePersonaEstudianteArray {

    public static void main(String[] args) {
        Estudiante estudiantes[] = new Estudiante[3];
        Scanner sc1 = new Scanner (System.in);
        String nombre;
        Scanner sc2 = new Scanner (System.in);
        int añoNac;
        Scanner sc3 = new Scanner (System.in);
        String carrera;
        
        for (int i=0;i<3;i++){
            System.out.println("Por favor, introduce el nombre del estudiante: "+(i+1));
            nombre=sc1.nextLine();
            System.out.println("Introduce el año de nacimiento del estudiante: "+(i+1));
            añoNac=sc2.nextInt();
            System.out.println("Que carrera estudia el estudiante: "+(i+1));
            carrera=sc3.nextLine();
            estudiantes[i]= new Estudiante(carrera,nombre,añoNac);
        }
        for (int i=0;i<3;i++){
            System.out.println("-------------Datos del estudiante nº "+(i+1)+"------------");
            estudiantes[i].dibujarDatos();
            System.out.println("El estudiante tiene "+estudiantes[i].edad(2020)+" años");
        }
        sc1.close();sc2.close();sc3.close();
    }
}
