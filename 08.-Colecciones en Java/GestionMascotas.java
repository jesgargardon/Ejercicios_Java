import java.util.ArrayList;
import java.util.Scanner;

class Mascota {
    String nombre;
    String especie;
    String raza;
    double precio;

    public Mascota(String nombre, String especie, String raza, double precio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.precio = precio;
    }
}

public class GestionMascotas {
    private static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar nueva mascota");
            System.out.println("2. Eliminar mascota");
            System.out.println("3. Actualizar precio de mascota");
            System.out.println("4. Listar todas las mascotas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch(opcion) {
                case 1:
                    agregarMascota(scanner);
                    break;
                case 2:
                    eliminarMascota(scanner);
                    break;
                case 3:
                    actualizarPrecioMascota(scanner);
                    break;
                case 4:
                    listarMascotas();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while(opcion != 5);
    }

    private static void agregarMascota(Scanner scanner) {
        System.out.print("Nombre de la mascota: ");
        String nombre = scanner.nextLine();
        System.out.print("Especie: ");
        String especie = scanner.nextLine();
        System.out.print("Raza: ");
        String raza = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        for (Mascota mascota : mascotas) {
            if (mascota.nombre.equalsIgnoreCase(nombre)) {
                mascota.especie = especie;
                mascota.raza = raza;
                mascota.precio = precio;
                System.out.println("La mascota ya existía y se ha actualizado su información.");
                return;
            }
        }

        mascotas.add(new Mascota(nombre, especie, raza, precio));
        System.out.println("Mascota agregada exitosamente.");
    }

    private static void eliminarMascota(Scanner scanner) {
        System.out.print("Nombre de la mascota a eliminar: ");
        String nombre = scanner.nextLine();

        for (Mascota mascota : mascotas) {
            if (mascota.nombre.equalsIgnoreCase(nombre)) {
                mascotas.remove(mascota);
                System.out.println("Mascota eliminada exitosamente.");
                return;
            }
        }

        System.out.println("Mascota no encontrada.");
    }

    private static void actualizarPrecioMascota(Scanner scanner) {
        System.out.print("Nombre de la mascota a actualizar: ");
        String nombre = scanner.nextLine();

        for (Mascota mascota : mascotas) {
            if (mascota.nombre.equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                mascota.precio = nuevoPrecio;
                System.out.println("Precio actualizado exitosamente.");
                return;
            }
        }

        System.out.println("Mascota no encontrada.");
    }

    private static void listarMascotas() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas en el sistema.");
        } else {
            for (Mascota mascota : mascotas) {
                System.out.println("Nombre: " + mascota.nombre + ", Especie: " + mascota.especie + ", Raza: " + mascota.raza + ", Precio: " + mascota.precio);
            }
        }
    }
}
