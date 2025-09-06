import java.util.ArrayList;
import java.util.Scanner;

    class Tarea {
        int id;
        String descripcion;
        String responsable;
        String estado;

        public Tarea(int id, String descripcion, String responsable, String estado) {
            this.id = id;
            this.descripcion = descripcion;
            this.responsable = responsable;
            this.estado = estado;
        }

        public String toString() {
            return "ID: " + id + ", Descripción: " + descripcion + ", Responsable: " + responsable + ", Estado: " + estado;
        }
    }

    public class GestionTareas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Tarea> listaTareas = new ArrayList<>();

            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Dar de alta una tarea nueva");
                System.out.println("2. Borrar una tarea");
                System.out.println("3. Cambiar responsable de una tarea");
                System.out.println("4. Listado de tareas abiertas");
                System.out.println("5. Listado de tareas cerradas");
                System.out.println("6. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        altaTarea(listaTareas, scanner);
                        break;
                    case 2:
                        borrarTarea(listaTareas, scanner);
                        break;
                    case 3:
                        cambiarResponsable(listaTareas, scanner);
                        break;
                    case 4:
                        listarTareas(listaTareas, "abierto");
                        break;
                    case 5:
                        listarTareas(listaTareas, "cerrado");
                        break;
                    case 6:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 6);
        }

        public static void altaTarea(ArrayList<Tarea> listaTareas, Scanner scanner) {
            System.out.print("Introduce el ID de la tarea: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner
            System.out.print("Introduce la descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            System.out.print("Introduce el responsable de la tarea: ");
            String responsable = scanner.nextLine();
            System.out.print("Introduce el estado de la tarea (abierto/cerrado): ");
            String estado = scanner.nextLine();

            if (estado.equals("abierto") || estado.equals("cerrado")) {
                Tarea tarea = new Tarea(id, descripcion, responsable, estado);
                listaTareas.add(tarea);
                System.out.println("Tarea añadida correctamente.");
            } else {
                System.out.println("Error: el estado de la tarea debe ser 'abierto' o 'cerrado'.");
            }
        }

        public static void borrarTarea(ArrayList<Tarea> listaTareas, Scanner scanner) {
            System.out.print("Introduce el ID de la tarea a borrar: ");
            int idBorrar = scanner.nextInt();
            boolean encontrado = false;

            for (int i = 0; i < listaTareas.size(); i++) {
                if (listaTareas.get(i).id == idBorrar) {
                    listaTareas.remove(i);
                    System.out.println("Tarea borrada correctamente.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ninguna tarea con ese ID.");
            }
        }

        public static void cambiarResponsable(ArrayList<Tarea> listaTareas, Scanner scanner) {
            System.out.print("Introduce el ID de la tarea para cambiar el responsable: ");
            int idCambiar = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner
            boolean encontrado = false;

            for (Tarea tarea : listaTareas) {
                if (tarea.id == idCambiar) {
                    System.out.print("Introduce el nuevo responsable de la tarea: ");
                    String nuevoResponsable = scanner.nextLine();
                    tarea.responsable = nuevoResponsable;
                    System.out.println("Responsable de la tarea cambiado correctamente.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ninguna tarea con ese ID.");
            }
        }

        public static void listarTareas(ArrayList<Tarea> listaTareas, String estado) {
            System.out.println("Listado de tareas " + estado + "s:");
            for (Tarea tarea : listaTareas) {
                if (tarea.estado.equals(estado)) {
                    System.out.println(tarea);
                }
            }
        }
    }