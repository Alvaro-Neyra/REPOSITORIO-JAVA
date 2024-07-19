import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        int numero = 0;
        do {
            try {
                do {
                    System.out.print("Introduce un número entero positivo: ");
                    numero = sc.nextInt();
                } while ( numero < 0);
                error = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Debes introducir un número entero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + (e.getMessage() != null ? e.getMessage() : "Error desconocido"));
                sc.nextLine();
            }
        } while (!error);

        System.out.println("El número de Fibonacci en la posición " + numero + " es: " + fibonacci(numero));
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
    
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
