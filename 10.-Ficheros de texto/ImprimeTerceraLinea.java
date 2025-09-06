import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImprimeTerceraLinea {

    public static void main(String[] args) {
        String ruta;
        ruta="tablasMultiplicar.txt";
        String linea;
        File fichero = new File(ruta);
        
        try {
            Scanner sc = new Scanner(fichero);
            int contador =1;
            while (sc.hasNext()){
                linea = sc.nextLine();
                if (contador==3){
                    System.out.println ("La tercera linea es: \n"+linea);
                }
                contador++;
            }
        } catch (IOException ex) {
            Logger.getLogger(ImprimeTerceraLinea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
