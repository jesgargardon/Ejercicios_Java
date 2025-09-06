public class NumerosImparesEnArray {
    public static void main(String[] args) {
        int numeros[] ={3,4,7,8,23,12,45,7};
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]%2!=0){
                System.out.print(numeros[i]+" , ");
            }
        }
    }
}
