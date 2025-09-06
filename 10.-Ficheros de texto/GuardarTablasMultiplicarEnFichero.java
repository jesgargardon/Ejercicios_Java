import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarTablasMultiplicarEnFichero {

    public static void main(String[] args) {
        File fichero = new File("tablasMultiplicar.txt");
        try {
            fichero.createNewFile();
            imprimir(fichero);
        } catch (IOException ex) {
            System.out.println("Se ha producido el siguiente error:");
            System.out.println(ex);
        }
    }
    public static void imprimir(File f){
        try {
            FileWriter escribir = new FileWriter(f);
            for (int i=1;i<11;i++){
                escribir.append("\n"+"La tabla del "+i+"\n");
                escribir.append("-----------------"+"\n");
                for (int j=1;j<11;j++){
                escribir.append(i+" * "+j+" = "+i*j+"\n");
                }
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Se ha producido el siguiente error:");
            System.out.println(ex);
        }
    }
}
