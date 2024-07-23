import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciConPosicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicion = 0;
        boolean error = true;
        do {
            try {
                do {
                    System.out.print("Ingrese la posicion del numero de Fibonacci: ");
                    posicion = sc.nextInt();
                } while (posicion < 0);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero entero positivo");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (error);

    
        System.out.println("El numero de Fibonacci en la posicion " + posicion + " es: " + fibonacci(posicion));

        sc.close();
    }

    public static long fibonacci(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        } else {
            return fibonacci(posicion - 1) + fibonacci(posicion - 2);
        }

        // Sin recursion
        // long a = 0;
        // long b = 1;
        // long c = 0;
        // for (int i = 0; i < posicion; i++) {
        //     c = a + b;
        //     a = b;
        //     b = c;
        // }
    }
}
