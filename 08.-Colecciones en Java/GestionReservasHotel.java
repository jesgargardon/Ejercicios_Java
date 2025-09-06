import java.util.ArrayList;
import java.util.Scanner;

class Reserva {
    String cliente;
    int numeroHabitacion;
    int numDiasReserva;

    public Reserva(String cliente, int numeroHabitacion, int numDiasReserva) {
        this.cliente = cliente;
        this.numeroHabitacion = numeroHabitacion;
        this.numDiasReserva = numDiasReserva;
    }

    public String toString() {
        return "Cliente: " + cliente + ", Habitación: " + numeroHabitacion + ", Días de reserva: " + numDiasReserva;
    }
}

public class GestionReservasHotel {
    public static void main(String[] args) {
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        boolean[] habitacionesOcupadas = new boolean[51]; // Índices de 1 a 50

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar una nueva reserva");
            System.out.println("2. Eliminar una reserva");
            System.out.println("3. Listado de reservas");
            System.out.println("4. Reporte de número de habitaciones");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarReserva(listaReservas, habitacionesOcupadas, scanner);
                    break;
                case 2:
                    eliminarReserva(listaReservas, habitacionesOcupadas, scanner);
                    break;
                case 3:
                    listarReservas(listaReservas);
                    break;
                case 4:
                    reporteNumeroHabitaciones(habitacionesOcupadas);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    public static void agregarReserva(ArrayList<Reserva> listaReservas, boolean[] habitacionesOcupadas, Scanner scanner) {
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Introduce el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Introduce el número de habitación: ");
        int numeroHabitacion = scanner.nextInt();
        if (numeroHabitacion < 1 || numeroHabitacion > 50) {
            System.out.println("Número de habitación no válido. Debe estar entre 1 y 50.");
            return;
        }

        if (habitacionesOcupadas[numeroHabitacion]) {
            System.out.println("La habitación " + numeroHabitacion + " ya está reservada. Por favor, elige otra.");
            return;
        }

        System.out.print("Introduce el número de días de la reserva: ");
        int numDiasReserva = scanner.nextInt();

        Reserva nuevaReserva = new Reserva(cliente, numeroHabitacion, numDiasReserva);
        listaReservas.add(nuevaReserva);
        habitacionesOcupadas[numeroHabitacion] = true;

        System.out.println("Reserva agregada correctamente.");
    }

    public static void eliminarReserva(ArrayList<Reserva> listaReservas, boolean[] habitacionesOcupadas, Scanner scanner) {
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Introduce el nombre del cliente para eliminar la reserva: ");
        String clienteEliminar = scanner.nextLine();

        boolean reservaEliminada = false;
        for (int i = 0; i < listaReservas.size(); i++) {
            Reserva reserva = listaReservas.get(i);
            if (reserva.cliente.equals(clienteEliminar)) {
                habitacionesOcupadas[reserva.numeroHabitacion] = false;
                listaReservas.remove(i);
                reservaEliminada = true;
                System.out.println("Reserva eliminada correctamente.");
                break;
            }
        }

        if (!reservaEliminada) {
            System.out.println("No se encontró ninguna reserva para el cliente especificado.");
        }
    }

    public static void listarReservas(ArrayList<Reserva> listaReservas) {
        System.out.println("Listado de todas las reservas:");
        for (Reserva reserva : listaReservas) {
            System.out.println(reserva);
        }
    }

    public static void reporteNumeroHabitaciones(boolean[] habitacionesOcupadas) {
        int numHabitacionesReservadas = 0;
        for (boolean ocupada : habitacionesOcupadas) {
            if (ocupada) {
                numHabitacionesReservadas++;
            }
        }

        int numHabitacionesLibres = 50 - numHabitacionesReservadas;
        System.out.println("Número de habitaciones reservadas: " + numHabitacionesReservadas);
        System.out.println("Número de habitaciones libres: " + numHabitacionesLibres);
    }
}
