//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ElMetodoOperacion {
    public static void main(String[] args) {
        double x =7, y = 9, resultado = 0;
        for (int i=1; i<5; i++){
            operacion (x,y,i);
        }
    }
    static void operacion (double x, double y, int ope){
        switch (ope){
            case 1:
                System.out.println("La suma de "+x+" y "+y+" es igual a "+(x+y));
                break;
            case 2:
                System.out.println("La resta de "+x+" y "+y+" es igual a "+(x-y));
                break;
            case 3:
                System.out.println("La multiplicación de "+x+" y "+y+" es igual a "+(x*y));
                break;
            case 4:
                System.out.println("La división de "+x+" entre "+y+" es igual a "+(x/y));
                break;
        }
    }
}