import java.io.*;
import java.util.*;
public class GestionCuentasBancarias {
    private static final String NOMBRE_ARCHIVO = "cuentas.txt";
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = cargarCuentas();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("1 - Dar de alta una cuenta");
            System.out.println("2 - Dar de baja una cuenta");
            System.out.println("3 - Ingreso en una cuenta");
            System.out.println("4 - Retirada en una cuenta");
            System.out.println("5 - Listado de cuentas");
            System.out.println("6 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el enter
            switch (opcion) {
                case 1:
                    darDeAltaCuenta(cuentas, scanner);
                    break;
                case 2:
                    darDeBajaCuenta(cuentas, scanner);
                    break;
                case 3:
                    hacerIngreso(cuentas, scanner);
                    break;
                case 4:
                    hacerRetirada(cuentas, scanner);
                    break;
                case 5:
                    listarCuentas(cuentas);
                    break;
                case 6:
                    guardarCuentas(cuentas);
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
        scanner.close();
    }
    private static List<CuentaBancaria> cargarCuentas() {
        List<CuentaBancaria> cuentas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                double saldo = Double.parseDouble(campos[0]);
                String titular = campos[1];
                cuentas.add(new CuentaBancaria(saldo, titular));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar las cuentas: " + e.getMessage());
        }
        return cuentas;
    }
    private static void guardarCuentas(List<CuentaBancaria> cuentas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (CuentaBancaria cuenta : cuentas) {
                writer.write(cuenta.getSaldo() + "," + cuenta.getTitular());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las cuentas: " + e.getMessage());
        }
    }
    private static void darDeAltaCuenta(List<CuentaBancaria> cuentas, Scanner scanner) {
        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de leer el double
        CuentaBancaria nuevaCuenta = new CuentaBancaria(saldo, titular);
        cuentas.add(nuevaCuenta);
        System.out.println("Cuenta creada con éxito.");
    }
    private static void darDeBajaCuenta(List<CuentaBancaria> cuentas, Scanner scanner) {
        System.out.print("Ingrese el titular de la cuenta a dar de baja: ");
        String titular = scanner.nextLine();
        boolean cuentaEncontrada = false;
        Iterator<CuentaBancaria> iterator = cuentas.iterator();
        while (iterator.hasNext()) {
            CuentaBancaria cuenta = iterator.next();
            if (cuenta.getTitular().equalsIgnoreCase(titular)) {
                iterator.remove();
                cuentaEncontrada = true;
                break;
            }
        }
        if (cuentaEncontrada) {
            System.out.println("Cuenta eliminada con éxito.");
        } else {
            System.out.println("No se encontró ninguna cuenta con ese titular.");
        }
    }
    private static void hacerIngreso(List<CuentaBancaria> cuentas, Scanner scanner) {
        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese la cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de leer el double
        boolean cuentaEncontrada = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getTitular().equalsIgnoreCase(titular)) {
                cuenta.depositar(cantidad);
                cuentaEncontrada = true;
                break;
            }
        }
        if (cuentaEncontrada) {
            System.out.println("Ingreso realizado con éxito.");
        } else {
            System.out.println("No se encontró ninguna cuenta con ese titular.");
        }
    }
    private static void hacerRetirada(List<CuentaBancaria> cuentas, Scanner scanner) {
        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();
        boolean cuentaEncontrada = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getTitular().equalsIgnoreCase(titular)) {
                cuenta.retirar(cantidad);
                cuentaEncontrada = true;
                break;
            }
        }

        if (cuentaEncontrada) {
            System.out.println("Retirada realizada con éxito.");
        } else {
            System.out.println("No se encontró ninguna cuenta con ese titular.");
        }
    }



    private static void listarCuentas(List<CuentaBancaria> cuentas) {

        System.out.println("Listado de cuentas:");



        for (CuentaBancaria cuenta : cuentas) {

            System.out.println("Titular: " + cuenta.getTitular());

            System.out.println("Saldo: " + cuenta.getSaldo());

            System.out.println("---------------------------");

        }

    }

}





