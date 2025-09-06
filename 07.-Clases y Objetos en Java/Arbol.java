
public class Arbol {
   private int edad;
   private int altura;
    public Arbol(int edad, int altura) {
        this.edad = edad;
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
   public int precio(){
       return this.edad*7+this.altura*10;
   }
}
