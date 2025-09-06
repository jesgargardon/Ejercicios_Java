import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarFiltrarLista {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(51);
        listaNumeros.add(32);
        listaNumeros.add(79);
        listaNumeros.add(1);
        listaNumeros.add(47);
        listaNumeros.add(33);
        listaNumeros.add(49);
        listaNumeros.add(65);
        listaNumeros.add(107);
        listaNumeros.add(82);
        Collections.sort(listaNumeros);
        System.out.println("Lista ordenada: " + listaNumeros);

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = sc.nextInt();

        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = sc.nextInt();

        for (int i = 0; i < listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            if (numero < limiteInferior || numero > limiteSuperior) {
                listaNumeros.remove(i);
                i--;
            }
        }
        System.out.println("Lista final: " + listaNumeros);
    }
}
