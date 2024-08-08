import java.util.InputMismatchException;
import java.util.Scanner;

public class ObtenerDatos {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimirNombreYEdad(nombre, edad);
    }

    public static void imprimirNombre(String nombre) {
        System.out.print("Mi nombre es: " + nombre);
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        imprimirNombre(nombre);
        System.out.print(" y tengo " + edad + " años");
        System.out.println();
    }

    public static String obtenerNombre() {
        String nombre;
        do {
            System.out.print("Ingrese su nombre: ");
            nombre = sc.nextLine();

            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío!");
            }

            if (!verificarCadenaSoloConLetras(nombre)) {
                System.out.println("El nombre solo puede contener letras!");
            }
            
        } while (nombre.isEmpty() || !verificarCadenaSoloConLetras(nombre));
        return nombre;
    }

    public static int obtenerEdad() {
        boolean error = false;
        int edad = 0;

        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese su edad: ");
                    edad = sc.nextInt();
                    if (edad < 0) {
                        System.out.println("La edad no puede ser negativa!");
                    }
                } while (edad < 0);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero");
                error = true;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);
        return edad;
    }

    public static boolean verificarCadenaSoloConLetras(String cadena) {
        return cadena.matches("[a-zA-Z]+");
    }
}
