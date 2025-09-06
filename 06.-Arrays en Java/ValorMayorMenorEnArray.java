public class ValorMayorMenorEnArray {

    public static void main(String[] args) {
        int numeros[]={3,5,7,15,8,9,4,11,1,2,12};
        int mayor = numeros[0];
        int menor = mayor;
        int contador=0;
        while (contador<numeros.length){
            if (numeros[contador]>mayor){
                mayor=numeros[contador];
            }
            if (numeros[contador]<menor){
                menor=numeros[contador];
            }
            contador++;
        }
        System.out.println("El número mayor es: "+mayor);
        System.out.println("El número menor es: "+menor);
    }
}
