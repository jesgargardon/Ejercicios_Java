public class EliminarNumerosParesEnArray {
    public static void main(String[] args) {

        int[] array = {2,7,3,45,78,90};
        int numero_impares=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                numero_impares++;
            }
        }
        int[] impares = new int[numero_impares];
        int indice=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                impares[indice]=array[i];
                indice++;
            }
        }
        pintar_Array(impares);
    }
    private static void pintar_Array (int[] array){
        System.out.print("Array = ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" - ");
        }
    }
}