import java.util.Scanner;

public class VerificandoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        do {
            error = false;
            System.out.print("Digite un número decimal: ");
            String numero = sc.nextLine();
            try {
                Double numeroConvertido = Double.valueOf(numero);
                System.out.println("El número ingresado es: " + numeroConvertido);
            } catch (NumberFormatException e) {
                System.out.println("El número ingresado no es decimal");
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
            }
        } while (error);
        sc.close();
    }
}