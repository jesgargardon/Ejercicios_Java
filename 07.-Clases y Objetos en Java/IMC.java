import javax.swing.JOptionPane;

class Individuo{
    String nombre;
    int anoNacimiento;
    double peso, altura;

    public Individuo(String nombre) {
        this.nombre = nombre;
    }

    public Individuo(String nombre, int anoNacimiento, double peso, double altura) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
        this.peso = peso;
        this.altura = altura;
    }
    public double indiceMasaCorporal(){
        return (this.peso/(this.altura*this.altura));
    }
    public double indiceMasaCorporal(boolean recomendacion){
        if (recomendacion){
            double imc=this.indiceMasaCorporal();
            if (imc<=19){System.out.println("Deberías subir peso");}
            else if (imc<21){System.out.println("Bien, estás en tu peso");}
            else {System.out.println("Deberías bajar peso");}
        }
        return (this.peso/(this.altura*this.altura));
    }
    public boolean esAdulto(int anoActual){
        return (anoActual - anoNacimiento) >= 18;
    }
}

public class IMC {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        int anoNacimiento=0;
        String anoNac = JOptionPane.showInputDialog("¿Cuál es tu año de nacimiento?");
        try {
            anoNacimiento = Integer.parseInt(anoNac);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No has introducido un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        double peso=0.0;
        String p = JOptionPane.showInputDialog("¿Cuál es tu peso en Kg?");
        try {
            peso = Double.parseDouble(p);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No has introducido un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        double altura=0.0;
        String a = JOptionPane.showInputDialog("¿Cuál es tu altura en m?");
        try {
            altura = Double.parseDouble(a);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No has introducido un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Individuo indi= new Individuo(nombre,anoNacimiento,peso,altura);
        System.out.println("Nombre: "+indi.nombre+"; Año de nacimiento: "+indi.anoNacimiento+"; peso: "+indi.peso+" Kg ; altura: "+indi.altura+" m");
        System.out.println("Es adulto?: "+indi.esAdulto(2025)+"; Indice de masa corporal: "+indi.indiceMasaCorporal());
        System.out.print("Recomendación en función del indice de masa corporal: ");
        indi.indiceMasaCorporal(true);
    }
}
