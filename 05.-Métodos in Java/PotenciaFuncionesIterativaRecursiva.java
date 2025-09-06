import java.util.Scanner;
public class PotenciaFuncionesIterativaRecursiva {

    static double aElevadoN_versionIterativa(double a, int n) {
        double res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * a;
        }
        return (res);
    }
    static double aElevadoN_versionRecursiva(double a, int n) {
        double res;
        if (n == 0) {
            res = 1;
        } else {
            res = a * aElevadoN_versionRecursiva(a, n - 1);
        }
        return (res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca base (real): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca exponente (entero no negativo): ");
        int exp = sc.nextInt();
        sc.close();
        double res = aElevadoN_versionIterativa(base, exp);
        System.out.println("Función iterativa -> "+base + " elevado a " + exp + " = " + res);
        res = aElevadoN_versionRecursiva(base, exp);
        System.out.println("Función recursiva -> "+base + " elevado a " + exp + " = " + res);
    }
}

