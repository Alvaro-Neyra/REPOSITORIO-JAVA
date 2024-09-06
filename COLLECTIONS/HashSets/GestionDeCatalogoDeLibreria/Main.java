package GestionDeCatalogoDeLibreria;

import java.util.InputMismatchException;
import java.util.Scanner;

import GestionDeCatalogoDeLibreria.modelos.Libreria;
import GestionDeCatalogoDeLibreria.modelos.Libro;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        int ISBN = 0;
        int opcion = 0;
        do {
            menu();
            opcion = obtenerOpcion();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titulo del libro");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor = sc.nextLine();
                    ISBN = obtenerNumero("Ingrese el ISBN del libro");
                    Libro libro = new Libro(titulo, autor, ISBN);
                    libreria.agregarLibro(libro);
                    break;
                case 2:
                    System.out.println("Ingrese el ISBN del libro a eliminar");
                    ISBN = sc.nextInt();
                    libreria.eliminarLibro(ISBN);
                    break;
                case 3:
                    libreria.mostrarLibros();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 4);
    }

    public static void menu() {
        System.out.println("1. Agregar libro");
        System.out.println("2. Eliminar libro");
        System.out.println("3. Mostrar libros");
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
