import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificandoDecimal {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite un número decimal: ");
            String numero = sc.nextLine();
            
            Double numeroConvertido = Double.valueOf(numero);

            System.out.println("El número ingresado es: " + numeroConvertido);

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("El número ingresado no es decimal");
            main(args);
        } catch (NumberFormatException e) {
            System.out.println("El número ingresado no es decimal");
            main(args);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }
}