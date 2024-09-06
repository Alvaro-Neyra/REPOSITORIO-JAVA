package GestionDeReservas;
import GestionDeReservas.modelos.Reserva;
import GestionDeReservas.modelos.SistemaGestionReservas;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SistemaGestionReservas sistema = new SistemaGestionReservas();
        int opcion = 0;
        do {
            menu();
            opcion = obtenerOpcion();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    String idReserva = obtenerCadena("Ingrese el id de la reserva: ");
                    boolean existe = sistema.getReservas().containsKey(idReserva);
                    if (!existe) {
                        String fechaReserva = obtenerCadena("Ingrese la fecha de la reserva: ");
                        String nombreReserva = obtenerCadena("Ingrese el nombre de la reserva: ");
                        Reserva reserva = new Reserva(idReserva, fechaReserva, nombreReserva);
                        sistema.addReserva(reserva);
                    } else {
                        System.out.println("La reserva ya existe");
                    }
                    break;
                case 2:
                    String idReservaEliminar = obtenerCadena("Ingrese el id de la reserva a eliminar: ");
                    sistema.removeReserva(idReservaEliminar);
                    break;
                case 3:
                    String idReservaMostrar = obtenerCadena("Ingrese el id de la reserva a mostrar: ");
                    sistema.getReserva(idReservaMostrar);
                    break;
                case 4:
                    sistema.showReservas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }

    public static int obtenerOpcion() {
        int opcion = 0;
        do {
            opcion = obtenerNumero("Ingrese una opcion: ");
            if (opcion < 1 || opcion > 5) {
                System.out.println("Error: Opcion no valida");
            }
        } while (opcion < 1 || opcion > 5);
        return opcion;
    }

    public static void menu() {
        System.out.println("1. Agregar reserva");
        System.out.println("2. Eliminar reserva");
        System.out.println("3. Mostrar reserva");
        System.out.println("4. Mostrar todas las reservas");
        System.out.println("5. Salir");
    }

    public static int obtenerNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    public static String obtenerCadena(String mensaje) {
        boolean error = false;
        String cadena = "";
        do {
            try {
                System.out.print(mensaje);
                cadena = sc.nextLine();
                error = false;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return cadena;
    }
}
