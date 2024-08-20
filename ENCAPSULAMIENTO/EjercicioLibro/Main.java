package EjercicioLibro;
import java.util.InputMismatchException;
import java.util.Scanner;
import EjercicioLibro.modelos.Libro;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Libro[] libros = new Libro[0];

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de libros");
        Main programa = new Main();
        programa.iniciar();
    }

    public void iniciar() {
        int opcion;
        do {
            menu();
            opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    mostrarLibros(libros);
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 3);
    }

    public void menu() {
        System.out.println("1. Crear Libro");
        System.out.println("2. Mostrar Libros");
        System.out.println("3. Salir");
    }

    public int obtenerOpcion() {
        int opcion = 0;
        boolean error = false;
        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese la opcion: ");
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 3);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número entero");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return opcion;
    }

    public void crearLibro() {
        sc.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        int paginas = sc.nextInt();
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setPaginas(paginas);
        libros = agregarAlFinal(libros, libro);
    }

    public void mostrarLibros(Libro[] libros) {
        if (libros.length == 0) {
            System.out.println("No hay libros para mostrar");
            return;
        }
        
        for (int i = 0; i < libros.length; i++) {
            System.out.println("Libro " + (i + 1));
            libros[i].imprimirDetalles();
        }
    }

    public Libro[] agregarAlFinal(Libro[] libros, Libro libro) {
        Libro[] temp = new Libro[libros.length + 1];
        for (int i = 0; i < libros.length; i++) {
            temp[i] = libros[i];
        }
        temp[temp.length - 1] = libro;
        return temp;
    }
}
