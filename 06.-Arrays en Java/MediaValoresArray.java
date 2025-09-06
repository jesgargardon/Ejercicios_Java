public class MediaValoresArray {
    public static void main(String[] args) {
        int numeros[]={3,5,2,10,7};
        float media;
        int numElementos = numeros.length;
        int suma = 0;
        for (int i=0;i<numElementos;i++){
            suma = suma + numeros[i];
        }  
        media = (float)suma /(float)numElementos;
        System.out.println("La media es: "+media);
    }
}
