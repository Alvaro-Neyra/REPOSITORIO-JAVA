import java.util.InputMismatchException;
import java.util.Scanner;

public class EsPar {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = solicitarNumero();
        esPar(numero);
        sc.close();
    }

    public static int solicitarNumero() {
        int numero = 0;
        boolean error = false;
        
        do {
            error = false;
            try {
                System.out.print("Introduce un número entero: ");
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: No has introducido un número entero.");
                error = true;
                sc.nextLine(); /* Limpiar el scanner */
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);

        return numero;
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
            return true;
        } else {
            System.out.println("El número " + numero + " es impar.");
            return false;
        }
    }
}