import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        boolean errorCadena = false;
        String nombre;
        
        do {
            errorCadena = false;
            System.out.print("Ingresa tu nombre: ");
            nombre = sc.nextLine();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío!");
                errorCadena = true;
            }

            if (!verificarCadenaSoloConLetras(nombre)) {
                System.out.println("El nombre solo puede contener letras!");
                errorCadena = true;
            }

        } while (errorCadena);

        boolean error = false;
        do {
            error = false;
            try {
                do {
                    System.out.print("Ingresa tu edad: ");
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
        imprimirNombreYEdad(nombre, edad);
        sc.close();
    }

    public static void imprimirNombre(String nombre) {
        System.out.print("Mi nombre es: " + nombre);
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        imprimirNombre(nombre);
        System.out.print(" y tengo " + edad + " años");
        System.out.println();
    }

    public static boolean verificarCadenaSoloConLetras(String cadena) {
        return cadena.matches("[a-zA-Z]+");
    }
}