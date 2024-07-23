import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numero = 0;
        boolean error = true;
        do {
            try {
                do {
                    System.out.print("Ingrese un numero positivo: ");
                    numero = sc.nextLong();
                } while (numero < 0);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero entero positivo");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (error);

        System.out.println("El factorial de " + numero + " es: " + factorial(numero));

        sc.close();
    }

    public static long factorial(long numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}