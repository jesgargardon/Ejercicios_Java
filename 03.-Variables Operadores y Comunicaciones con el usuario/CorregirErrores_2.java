public class CorregirErrores_2 {
    public static void main(String args[]) {
        int a,b,c;
        a = 10; b=10;
        c =a+b;
        int cont=0;
        for (int i=a;i<c;i++){
            cont++;
            System.out.println("cont: " + cont);
            System.out.println(b+cont);
        }
    }
}
