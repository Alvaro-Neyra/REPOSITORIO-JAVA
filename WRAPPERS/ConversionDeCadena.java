import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConversionDeCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        do {
            error = false;
            try {
                System.out.print("Ingrese un numero entero: ");
                String numero = sc.nextLine();
                int numeroConvertido = Integer.parseInt(numero);
                System.out.println("El numero ingresado es: " + numeroConvertido);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el numero, introduce un numero entero");
                mostrarLineaError(e);
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                mostrarLineaError(e);
                error = true;
            }
        } while (error);
        sc.close();
    }

    private static void mostrarLineaError(Exception e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        if (stackTrace.length > 0) {
        StackTraceElement element = stackTrace[0];
            System.out.println("Error en la línea " + element.getLineNumber() + " de la clase " + element.getClassName());
        }
    }
}
