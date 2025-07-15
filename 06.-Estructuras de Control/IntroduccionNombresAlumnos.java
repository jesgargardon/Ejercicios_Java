import java.util.Scanner;
public class IntroduccionNombresAlumnos {


    public static void main(String[] args) {
        int numeroAlumnos;
        Scanner lector1=new Scanner(System.in);
        System.out.println("Introduce el número de alumnos en clase");
        numeroAlumnos = lector1.nextInt();
        String [] nombres;
        nombres = new String[numeroAlumnos];
        Scanner lector2=new Scanner(System.in);
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println("Introduce el nombre del alumno "+(i+1));
            nombres[i] = lector2.nextLine(); 
        }
        System.out.println("Han sido introducidos los nombres de "+numeroAlumnos+" alumnos");
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println(nombres[i]);
        }
    }
    
}
