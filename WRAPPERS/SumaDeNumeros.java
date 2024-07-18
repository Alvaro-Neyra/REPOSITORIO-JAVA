import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        do {
            error = false;
            try {
                System.out.print("Ingrese un numero entero: ");
                String numero1 = sc.nextLine();
                System.out.print("Ingrese un numero decimal: ");
                String numero2 = sc.nextLine();

                int numeroConvertido = Integer.valueOf(numero1);
                double numeroConvertido2 = Double.valueOf(numero2);

                double resultado = numeroConvertido + numeroConvertido2;

                System.out.println("La suma de los numeros ingresados es: " + resultado);
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

    }

    private static void mostrarLineaError(Exception e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        if (stackTrace.length > 0) {
            StackTraceElement element = stackTrace[0];
            System.out
                    .println("Error en la línea " + element.getLineNumber() + " de la clase " + element.getClassName());
        }
    }
}
