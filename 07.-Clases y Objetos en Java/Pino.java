public class Pino extends Arbol {
   private int piñas;
   private boolean piñonescomestibles;

    public Pino(int edad, int altura,int piñas, boolean piñonescomestibles) {
        super(edad, altura);
        this.piñas = piñas;
        this.piñonescomestibles = piñonescomestibles;
    }

    public int getPiñas() {
        return piñas;
    }

    public void setPiñas(int piñas) {
        this.piñas = piñas;
    }

    public boolean isPiñonescomestibles() {
        return piñonescomestibles;
    }

    public void setPiñonescomestibles(boolean piñonescomestibles) {
        this.piñonescomestibles = piñonescomestibles;
    }
   public void mostrardatos(){
       System.out.println("la edad del arbol es la siguiente: "+this.getEdad()+" años");
       System.out.println("la altura del arbol es la siguiente: "+this.getAltura()+ "metros");
       System.out.println("el numero de piñas que tiene es el siguiente: "+this.getPiñas());
       System.out.println("¿los piñones son comestibles? "+ this.isPiñonescomestibles());
   }
}
