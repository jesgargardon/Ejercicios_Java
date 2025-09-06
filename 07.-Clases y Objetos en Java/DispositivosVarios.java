class Dispositivo {
    String marca;
    String modelo;
    double precio;

    public Dispositivo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Precio: " + precio;
    }
}

class Smartphone extends Dispositivo {
    String sistemaOperativo;

    public Smartphone(String marca, String modelo, double precio, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String toString() {
        return super.toString() + ", Sistema Operativo: " + sistemaOperativo;
    }
}

class Portatil extends Dispositivo {
    int tamanoPantalla;

    public Portatil(String marca, String modelo, double precio, int tamanoPantalla) {
        super(marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public String toString() {
        return super.toString() + ", Tamaño de Pantalla: " + tamanoPantalla + " pulgadas";
    }
}


public class DispositivosVarios {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S20", 899.99, "Android");
        Portatil portatil = new Portatil("Apple", "MacBook Pro", 1499.99, 13);

        System.out.println("Detalles del Smartphone:");
        System.out.println(smartphone);

        System.out.println("\nDetalles del Portátil:");
        System.out.println(portatil);

    }
}