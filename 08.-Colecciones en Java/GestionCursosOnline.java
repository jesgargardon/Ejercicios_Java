import java.util.ArrayList;
import java.util.Scanner;

class Curso {
    String nombre;
    String instructor;
    String categoria;
    double precio;

    public Curso(String nombre, String instructor, String categoria, double precio) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Instructor: " + instructor + ", Categoría: " + categoria + ", Precio: " + precio;
    }
}

public class GestionCursosOnline {
    public static void main(String[] args) {
        ArrayList<Curso> listaCursos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un nuevo curso");
            System.out.println("2. Eliminar un curso");
            System.out.println("3. Actualizar el precio de un curso");
            System.out.println("4. Listar todos los cursos");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarCurso(listaCursos, scanner);
                    break;
                case 2:
                    eliminarCurso(listaCursos, scanner);
                    break;
                case 3:
                    actualizarPrecioCurso(listaCursos, scanner);
                    break;
                case 4:
                    listarCursos(listaCursos);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    public static void agregarCurso(ArrayList<Curso> listaCursos, Scanner scanner) {
        scanner.nextLine();  // Limpiar el buffer del scanner
        System.out.print("Introduce el nombre del curso: ");
        String nombre = scanner.nextLine();

        // Verificar si el curso ya existe
        Curso cursoExistente = buscarCursoPorNombre(listaCursos, nombre);
        if (cursoExistente != null) {
            System.out.println("El curso ya existe en el sistema. Se actualizarán los detalles.");
            actualizarCurso(cursoExistente, scanner);
        } else {
            System.out.print("Introduce el nombre del instructor: ");
            String instructor = scanner.nextLine();
            System.out.print("Introduce la categoría del curso: ");
            String categoria = scanner.nextLine();
            System.out.print("Introduce el precio del curso: ");
            double precio = scanner.nextDouble();

            Curso nuevoCurso = new Curso(nombre, instructor, categoria, precio);
            listaCursos.add(nuevoCurso);
            System.out.println("Curso agregado correctamente.");
        }
    }

    public static void eliminarCurso(ArrayList<Curso> listaCursos, Scanner scanner) {
        scanner.nextLine();  // Limpiar el buffer del scanner
        System.out.print("Introduce el nombre del curso a eliminar: ");
        String nombre = scanner.nextLine();

        Curso cursoAEliminar = buscarCursoPorNombre(listaCursos, nombre);
        if (cursoAEliminar != null) {
            listaCursos.remove(cursoAEliminar);
            System.out.println("Curso eliminado correctamente.");
        } else {
            System.out.println("El curso no existe en el sistema.");
        }
    }

    public static void actualizarPrecioCurso(ArrayList<Curso> listaCursos, Scanner scanner) {
        scanner.nextLine();  // Limpiar el buffer del scanner
        System.out.print("Introduce el nombre del curso para actualizar el precio: ");
        String nombre = scanner.nextLine();

        Curso cursoActualizar = buscarCursoPorNombre(listaCursos, nombre);
        if (cursoActualizar != null) {
            System.out.print("Introduce el nuevo precio del curso: ");
            double nuevoPrecio = scanner.nextDouble();
            cursoActualizar.precio = nuevoPrecio;
            System.out.println("Precio del curso actualizado correctamente.");
        } else {
            System.out.println("El curso no existe en el sistema.");
        }
    }

    public static void listarCursos(ArrayList<Curso> listaCursos) {
        System.out.println("Listado de todos los cursos:");
        for (Curso curso : listaCursos) {
            System.out.println(curso);
        }
    }

    public static Curso buscarCursoPorNombre(ArrayList<Curso> listaCursos, String nombre) {
        for (Curso curso : listaCursos) {
            if (curso.nombre.equals(nombre)) {
                return curso;
            }
        }
        return null;
    }

    public static void actualizarCurso(Curso curso, Scanner scanner) {
        System.out.print("Introduce el nombre del instructor: ");
        curso.instructor = scanner.nextLine();
        System.out.print("Introduce la categoría del curso: ");
        curso.categoria = scanner.nextLine();
        System.out.print("Introduce el precio del curso: ");
        curso.precio = scanner.nextDouble();
    }
}
