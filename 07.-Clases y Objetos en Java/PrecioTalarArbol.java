public class PrecioTalarArbol {
    
    public static void main(String[] args) {
        Pino pino1=new Pino(450,20,389,true);
        System.out.println("El precio de talar el arbol es "+pino1.precio());
        pino1.mostrardatos();
    }
    
}
