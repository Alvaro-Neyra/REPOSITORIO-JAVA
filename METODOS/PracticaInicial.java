import java.util.Scanner;

public class PracticaInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
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
}