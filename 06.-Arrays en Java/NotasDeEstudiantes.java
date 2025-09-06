import java.util.Scanner;
public class NotasDeEstudiantes {
    public static void main(String[] args) {
        String [] estudiantes = {"Pedro","Ana","Roberto","Lucia","Maria"};
        double [] notas = {7.0,2.3,4.5,6.7,5.7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre de un estudiante: ");
        String estudiante=sc.nextLine();
        for (int i=0;i<5;i++){
            if(estudiantes[i].equals(estudiante)){
                System.out.println("Estudiante "+estudiante+" tiene una nota de "+notas[i]);
            }
        }
    }

}
