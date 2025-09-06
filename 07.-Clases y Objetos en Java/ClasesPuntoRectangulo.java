class Punto {
    int x;
    int y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangulo {
    Punto punto1;
    Punto punto2;

    public Rectangulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    public int calcularArea() {
        int diferenciaX = Math.abs(punto1.x - punto2.x);
        int diferenciaY = Math.abs(punto1.y - punto2.y);

        if (diferenciaX == 0 || diferenciaY == 0) {
            System.out.println("No se puede calcular el área porque una de las diferencias de coordenadas es igual a cero.");
            return -1;
        }
        return diferenciaX * diferenciaY;
    }
}
public class ClasesPuntoRectangulo {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 5);
        Punto punto2 = new Punto(1, 1);
        Rectangulo rectangulo = new Rectangulo(punto1, punto2);
        int area = rectangulo.calcularArea();
        if (area != -1) {
            System.out.println("Área del rectángulo: " + area);
        }
    }
}