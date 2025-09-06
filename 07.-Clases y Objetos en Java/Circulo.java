import java.lang.Math;

public class Circulo {
    private double radio;
    public static final double PI = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

