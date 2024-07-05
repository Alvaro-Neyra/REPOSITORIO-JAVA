import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConExcepciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         try {
            System.out.println("Ingrese el primer número: ");
            int num1 = input.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = input.nextInt();

            int resta = num1 - num2;

            input.close();

            System.out.println("La resta es: " + resta);
        } catch(InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
