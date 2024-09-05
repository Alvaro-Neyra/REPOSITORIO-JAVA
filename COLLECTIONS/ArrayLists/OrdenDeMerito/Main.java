import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>();
        boolean agregar = true;
        int numero = 0;
        int opcion = 0;
        do {
            do {
                numero = pedirNumero("Ingrese un numero entero (1 y al 10): ");
                if (numero < 1 || numero > 10) {
                    System.out.println("El numero ingresado no esta en el rango de 1 a 10");
                }
            } while (numero < 1 || numero > 10);

            System.out.println("Numero ingresado: " + numero);
            enteros.add(numero);

            do {
                opcion = pedirNumero("Desea ingresar otro numero? (1. Si, 2. No): ");
            } while (opcion != 1 && opcion != 2);

            if (opcion == 2) {
                agregar = false;
            } else {
                agregar = true;
            }
        } while (agregar);

        System.out.println("Numeros ingresados: ");
        System.out.println("Ordenados descendentemente: ");
        mostrarNotasEnOrdenDescendente(enteros);
        System.out.println("Ordenados ascendentemente: ");
        mostrarNotasEnOrdenAscendente(enteros);

    }


    private static void mostrarNotasEnOrdenDescendente(ArrayList<Integer> notas) {
        Collections.sort(notas, Collections.reverseOrder());
        System.out.println("Notas en orden descendente:");
        for (int nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    private static void mostrarNotasEnOrdenAscendente(ArrayList<Integer> notas) {
        Collections.sort(notas);
        System.out.println("Notas en orden ascendente:");
        for (int nota : notas) {
        System.out.print(nota + " ");
        }
        System.out.println();
    }

    public static int pedirNumero(String mensaje) {
        int numero = 0;
        boolean error = false;
        do {
            error = false;
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un numero entero");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }
}