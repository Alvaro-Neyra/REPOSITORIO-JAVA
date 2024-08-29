package Biblioteca;
import java.util.InputMismatchException;
import java.util.Scanner;
import Biblioteca.modelos.Biblioteca;
import Biblioteca.modelos.Libro;
import Biblioteca.modelos.Persona;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        Biblioteca biblioteca = new Biblioteca();
        String nombre = obtenerTexto("Ingresar nombre: ");
        String apellido = obtenerTexto("Ingresar apellido: ");
        Persona persona = new Persona(nombre, apellido);

        int opcion = 0;
        do {
            menu();
            opcion = elegirOpcion();
            switch (opcion) {
                case 1:
                    String titulo = obtenerTexto("Ingresar título: ");
                    String autor = obtenerTexto("Ingresar autor: ");
                    int nroPaginas = obtenerNumero("Ingresar número de páginas: ");
                    Libro libro = new Libro(titulo, autor, nroPaginas);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    biblioteca.mostrarcatalogo();
                    break;
                case 3:
                    if (biblioteca.getCatalogo().isEmpty()) {
                        System.out.println("No hay libros en el catálogo");
                    } else {
                        String tituloEliminar = obtenerTexto("Ingresar título del libro a eliminar: ");
                        biblioteca.eliminarLibro(tituloEliminar);
                    }
                    break;
                case 4:
                    if (biblioteca.getCatalogo().isEmpty()) {
                        System.out.println("No hay libros en el catálogo");
                    } else {
                        String tituloLibroPrestar = obtenerTexto("Ingresar título del libro a prestar: ");
                        biblioteca.prestarLibro(persona, tituloLibroPrestar);
                    }
                    break;
                case 5:
                    if (biblioteca.getCatalogo().isEmpty()) {
                        System.out.println("No hay libros en el catálogo");
                    } else {
                        String tituloLibroDevolver = obtenerTexto("Ingresar el titulo del libro a devolver: ");
                        biblioteca.devolverLibro(persona, tituloLibroDevolver);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 6);
    }

    public static void menu() {
        System.out.println("1. Agregar libro");
        System.out.println("2. Mostrar catálogo");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Prestar libro");
        System.out.println("5. Devolver libro");
        System.out.println("6. Salir");
    }

    public static int elegirOpcion() {
        int opcion = 0;
        do {
            opcion = obtenerNumero("Elegir opción: ");
            if (opcion < 1 || opcion > 6) {
                System.out.println("Error: Debes ingresar un número entre 1 y 4");
            }
        } while (opcion < 1 || opcion > 6);
        return opcion;
    }

    public static int obtenerNumero(String mensaje) {
        int numero = 0;
        boolean error = false;
        do {
            error = false;
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                sc.nextLine(); // Limpia el buffer después de leer un número
            } catch (InputMismatchException e){
                System.out.println("Error: Debes ingresar un número entero");
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

    public static String obtenerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = sc.nextLine();
            if (texto.trim().isEmpty()) {  // Verifica que el texto no esté vacío
                System.out.println("Error: Debes ingresar un texto válido");
            }
        } while (texto.trim().isEmpty());
        return texto;
    }
}
