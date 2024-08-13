import java.util.InputMismatchException;
import java.util.Scanner;


public class EsPrimoRecursividad {
    public static Scanner scann = new Scanner(System.in);
    public static void main(String[] args) {

        int valor = pedirNumero();

        boolean rspt = esPrimoRecursivo(valor, 2);

        resultado(rspt, valor);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean esPrimoRecursivo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(numero)) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return esPrimoRecursivo(numero, divisor + 1);
    }

    public static void resultado(boolean rspt, int valor) {
        if (rspt) {
            System.out.println("El numero " + valor + " si es primo");
        } else {
            System.out.println("El numero " + valor + " no es primo");
        }

    }

    public static int pedirNumero() {
        int numero = 0;
        boolean error = false;

        do {
            error = false;
            try {
                do {
                    System.out.print("Introduce un numero entero positivo: ");
                    numero = scann.nextInt();

                    if (numero < 0) {
                        System.out.println("Debes introducir un número entero positivo");
                    }
                } while (numero < 0);
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero positivo");
                scann.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error inesperado");
                scann.nextLine();
                error = true;
            }
        } while (error);

        return numero;
    }
}
