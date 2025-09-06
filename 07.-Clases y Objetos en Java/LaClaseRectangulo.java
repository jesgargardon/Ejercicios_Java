public class LaClaseRectangulo {
    private double largo;
    private double ancho;

    public LaClaseRectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularPerimetro() {
        return 2 * largo + 2 * ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    // getters y setters
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

}
