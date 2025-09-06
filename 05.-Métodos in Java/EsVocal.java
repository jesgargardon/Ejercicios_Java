import java.util.Scanner;
public class EsVocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir letra");
        char c = sc.next().charAt(0);
        if (esVocal(c)){
            System.out.println("La letra" + c + " es una vocal ");
        }
        else{
            System.out.println("La letra" + c + " no es una vocal ");
        }
        sc.close();
    }
    static boolean esVocal(char c) {
        boolean resultado;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
