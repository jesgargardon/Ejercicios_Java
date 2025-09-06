import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContadorOcurrenciaLetraEnFichero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero:");
        String ruta = sc.nextLine();
        System.out.println("Introduce el caracter que quieres buscar");
        String busqueda = sc.nextLine();
        char caracter = busqueda.charAt(0);
        
        File fichero = new File(ruta);
        int cont=0;
        try (FileReader lector= new FileReader(fichero)){
            int letra;
            while ((letra=lector.read())!=-1){
                if((char)letra==caracter){
                    cont++;
                }
            }
        } catch (IOException e){
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        System.out.println("El numero de ocurrencias del caracter "+caracter+" es "+cont);
    }
}
