public class ImparesPosicionArray {
        public static void main(String[] args) {
        int numeros[]={3,5,2,10,7};
        int numElementos = numeros.length;
        for (int i=0;i<numElementos;i++){
            if (numeros[i]%2!=0){
                System.out.println("El valor "+numeros[i]+" es impar y ocupa la posición "+(i+1)+" en el array");
            }
        }
    }
}
