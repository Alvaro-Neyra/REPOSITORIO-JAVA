import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        boolean error = true;
        do {
            try {
                do {
                    System.out.print("Ingrese un numero positivo para la cantidad de numeros primos a mostrar: ");
                    cantidad = sc.nextInt();
                } while (cantidad < 0);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero entero positivo");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (error);

        int contadorNumerosPrimos = 0;

        System.out.println("La cantidad de numeros primos a mostrar son: ");
        System.out.print("| ");

        for (int i = 2; i < Long.MAX_VALUE; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " | ");
                contadorNumerosPrimos++;
            }

            if (contadorNumerosPrimos == cantidad) {
                break;
            }
        }

        sc.close();
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
