import java.util.Scanner;

public class PalabrasMasLargas {
    public static void main(String[] args) {
        int max_longitud=0;
        String[] palabras=new String[3];
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<3;i++){
            System.out.println("Introduce la palabra nº: "+(i+1));
            palabras[i]=sc.nextLine();
            if (palabras[i].length()>max_longitud){
                max_longitud=palabras[i].length();
            }
        }
        System.out.println("Las palabras más largas son: ");
        for (int i=0;i<3;i++){
            if (palabras[i].length()==max_longitud){
                System.out.println(" - "+palabras[i]);
            }
        }
    }
}