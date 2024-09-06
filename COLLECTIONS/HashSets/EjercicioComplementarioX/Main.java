package EjercicioComplementarioX;
import java.util.InputMismatchException;
import java.util.Scanner;
import EjercicioComplementarioX.modelos.Contacto;
import EjercicioComplementarioX.modelos.GestorDeContactos;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GestorDeContactos gestor = new GestorDeContactos();
        int opcion = 0;
        String nombre = "";
        String numeroTelefono = "";
        String correoElectronico = "";
        do {
            menu();
            opcion = obtenerOpcion();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el número de teléfono del contacto: ");
                    numeroTelefono = sc.nextLine();
                    System.out.println("Ingrese el correo electrónico del contacto: ");
                    correoElectronico = sc.nextLine();
                    Contacto contacto = new Contacto(nombre, numeroTelefono, correoElectronico);
                    gestor.agregarContactoArrayList(contacto);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    nombre = sc.nextLine();
                    Contacto contactoEliminar = new Contacto(nombre, "", "");
                    gestor.eliminarContactoArrayList(contactoEliminar);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el número de teléfono del contacto: ");
                    numeroTelefono = sc.nextLine();
                    System.out.println("Ingrese el correo electrónico del contacto: ");
                    correoElectronico = sc.nextLine();
                    Contacto contactoSet = new Contacto(nombre, numeroTelefono, correoElectronico);
                    gestor.agregarContactoHashSet(contactoSet);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    nombre = sc.nextLine();
                    Contacto contactoAEliminar = new Contacto(nombre, "", "");
                    gestor.eliminarContactoHashSet(contactoAEliminar);
                    break;
                case 5:
                    gestor.mostrarContactosArrayList();
                    break;
                case 6:
                    gestor.mostrarContactosHashSets();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        } while (opcion != 7);
    }

    public static void menu() {
        System.out.println("1. Agregar contacto utilizando ArrayList");
        System.out.println("2. Eliminar contacto utilizando ArrayList");
        System.out.println("3. Agregar contacto utilizando HashSet");
        System.out.println("4. Eliminar contacto utilizando HashSet");
        System.out.println("5. Mostrar contactos utilizando ArrayList");
        System.out.println("6. Mostrando contactos utilizando HashSet");
        System.out.println("7. Salir");
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
            if (opcion < 1 || opcion > 7) {
                System.out.println("Error: Ingrese una opción válida");
            }
        } while (opcion < 1 || opcion > 7);
        return opcion;
    }
}
