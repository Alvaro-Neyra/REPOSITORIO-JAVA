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

    public static String obtenerNombre () {
        System.out.print("Ingrese su nombre: ");
        return sc.nextLine();
    }

    public static int obtenerEdad () {
        System.out.print("Ingrese su edad: ");
        return sc.nextInt();
    }
}
