public class VariosValoresArrayEnteros {

    public static void main(String[] args) {
        int numeros[]={7,4,7,18,12,4,6,7,9};
        
        int maximo=0, minimo=numeros[1], suma=0;
        for(int i=0;i<numeros.length;i++){
            suma=suma+numeros[i];
            if (maximo<numeros[i]){
                maximo=numeros[i];
            }
            if (minimo>numeros[i]){
                minimo=numeros[i];
            }
        }
        System.out.println("Número de elementos del array: "+numeros.length);
        System.out.println("El maximo es: "+maximo);
        System.out.println("El minimo es: "+minimo);
        System.out.println("la suma de todos los números del array es: "+suma);
    }
}
