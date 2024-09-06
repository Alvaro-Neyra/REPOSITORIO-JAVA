import java.util.InputMismatchException;
import java.util.Scanner;
import modelos.RegistroDeInvitados;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        int opcion = 0;
        do {
            menu();
            opcion = obtenerOpcion();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del invitado");
                    String nombre = sc.nextLine();
                    registro.agregar(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del invitado a eliminar");
                    nombre = sc.nextLine();
                    registro.eliminar(nombre);
                    break;
                case 3:
                    registro.mostrarInvitados();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 4);
    }

    public static void menu() {
        System.out.println("1. Agregar invitado");
        System.out.println("2. Eliminar invitado");
        System.out.println("3. Mostrar invitados");
        System.out.println("4. Salir");
    }

    public static int obtenerNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido");
                sc.nextLine();
                error = true;
            }catch (Exception e) {
                System.out.println("Error: Ingrese un número válido");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    public static int obtenerOpcion() {
        int opcion = 0;
        do {
            opcion = obtenerNumero("Ingrese una opción");
            if (opcion < 1 || opcion > 4) {
                System.out.println("Error: Ingrese una opción válida");
            }
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
}