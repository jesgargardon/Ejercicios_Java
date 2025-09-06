import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumeroVecesTextoEnFichero {

    public static void main(String[] args) {
       
        String ruta, palabra, linea;
        int numPalabrasEncontradas=0;
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Introduce la ruta del fichero: ");
        ruta = sc1.nextLine();
        System.out.println("Introduce la palabra a buscar: ");
        palabra = sc2.nextLine();
        
        File fichero = new File(ruta);
        if (fichero.exists()){
            try {
                Scanner lector = new Scanner (fichero);
                while (lector.hasNext()){
                    linea = lector.nextLine();
                    numPalabrasEncontradas = numPalabrasEncontradas+palabrasEncontradasLinea(linea,palabra);
                }
                System.out.println("El texto \""+palabra+"\" aparece "+numPalabrasEncontradas+" veces en el documento "+ruta);
            } catch (FileNotFoundException ex) {
                System.out.println ("Se ha producido el error: "+ex);
            }
        }else {
            System.out.println("El fichero no existe. No podemos buscar palabras en un fichero que no existe");
        }
        
    }
    
    public static int palabrasEncontradasLinea(String linea,String palabra){
        int contador = 0;
        String li = linea.toLowerCase();
        String pa = palabra.toLowerCase();
        String ventana="";
        String letra;
        for (int i=0; i<(li.length()-pa.length()+1); i++){
            for (int j=i;j<i+pa.length();j++){
                ventana = ventana +li.charAt(j);
            }
            if (pa.equals(ventana)){
                contador++;
            }
            ventana="";
        }
        return contador;
    }
}
