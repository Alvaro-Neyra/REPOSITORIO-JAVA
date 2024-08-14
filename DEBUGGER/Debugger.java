import java.util.Scanner;

public class Debugger {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = pedirDouble("Ingrese el dividendo:");
        double b = pedirDouble("Ingrese el divisor:");
        System.out.println("El resultado de la división es: " + divide(a, b));
        scanner.close();
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero.");
        }
        return a / b;
    }

    public static double pedirDouble(String mensaje) {
        boolean error = false;
        double result = 0;
        do {
            try {
                System.out.print(mensaje);
                result = scanner.nextDouble();
                error = false;
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero.");
                scanner.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
                error = true;
            }
        } while (error);
        return result;
    }
}