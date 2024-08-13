import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialRecursivo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int n = pedirNumero();
        int resultado = factorial(n);

        System.out.println("El factorial de " + n + " es " + resultado);

        sc.close();
    }

    public static int pedirNumero() {
        int numero = 0;
        boolean error = false;

        do {
            error = false;
            try {
                do {
                    System.out.print("Introduce un numero entero positivo: ");
                    numero = sc.nextInt();

                    if (numero < 0) {
                        System.out.println("Debes introducir un número entero positivo");
                    }
                } while (numero < 0);
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero positivo");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error inesperado");
                sc.nextLine();
                error = true;
            }
        } while (error);

        return numero;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1){ // Caso base
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
