import java.util.ArrayList;
import java.util.Scanner;

public class GestionObraDeArte {
    private static ArrayList<ObraDeArte> obrasDeArte = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    agregarObra();
                    break;
                case 2:
                    eliminarObra();
                    break;
                case 3:
                    actualizarPrecio();
                    break;
                case 4:
                    listarObras();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Galería de Arte ---");
        System.out.println("1. Agregar una nueva obra de arte");
        System.out.println("2. Eliminar una obra de arte");
        System.out.println("3. Actualizar el precio de una obra de arte");
        System.out.println("4. Listar todas las obras de arte");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarObra() {
        System.out.print("Ingrese el título de la obra: ");
        String titulo = scanner.nextLine();
        ObraDeArte obraExistente = buscarObraPorTitulo(titulo);

        if (obraExistente != null) {
            System.out.println("La obra ya existe. Actualizando su información...");
            System.out.print("Ingrese el nuevo artista: ");
            String artista = scanner.nextLine();
            System.out.print("Ingrese el nuevo año de creación: ");
            int anio = scanner.nextInt();
            System.out.print("Ingrese el nuevo precio: ");
            double precio = scanner.nextDouble();
            obraExistente = new ObraDeArte(titulo, artista, anio, precio);
        } else {
            System.out.print("Ingrese el artista de la obra: ");
            String artista = scanner.nextLine();
            System.out.print("Ingrese el año de creación: ");
            int anio = scanner.nextInt();
            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            ObraDeArte nuevaObra = new ObraDeArte(titulo, artista, anio, precio);
            obrasDeArte.add(nuevaObra);
        }
        System.out.println("Obra de arte agregada o actualizada exitosamente.");
    }

    private static void eliminarObra() {
        System.out.print("Ingrese el título de la obra que desea eliminar: ");
        String titulo = scanner.nextLine();
        ObraDeArte obra = buscarObraPorTitulo(titulo);

        if (obra != null) {
            obrasDeArte.remove(obra);
            System.out.println("La obra ha sido eliminada.");
        } else {
            System.out.println("No se encontró una obra con ese título.");
        }
    }

    private static void actualizarPrecio() {
        System.out.print("Ingrese el título de la obra cuyo precio desea actualizar: ");
        String titulo = scanner.nextLine();
        ObraDeArte obra = buscarObraPorTitulo(titulo);

        if (obra != null) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            obra.setPrecio(nuevoPrecio);
            System.out.println("El precio de la obra ha sido actualizado.");
        } else {
            System.out.println("No se encontró una obra con ese título.");
        }
    }

    private static void listarObras() {
        if (obrasDeArte.isEmpty()) {
            System.out.println("No hay obras de arte en el sistema.");
        } else {
            System.out.println("\n--- Listado de Obras de Arte ---");
            for (ObraDeArte obra : obrasDeArte) {
                System.out.println(obra);
            }
        }
    }

    private static ObraDeArte buscarObraPorTitulo(String titulo) {
        for (ObraDeArte obra : obrasDeArte) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                return obra;
            }
        }
        return null;
    }
}