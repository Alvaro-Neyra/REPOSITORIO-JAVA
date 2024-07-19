import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean error = false;
        boolean esPrimoVariable = false;
        do {
            do {
                do {
                    try {
                        System.out.println("Introduce un número natural o (cero para cerrar el programa):");
                        numero = sc.nextInt();
                        error = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada no válida. Debes introducir un número entero.");
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("Error: " + (e.getMessage() != null ? e.getMessage() : "Error desconocido"));
                        sc.nextLine();
                    }
                } while (!error);
                
                esPrimoVariable = esPrimo(numero);
            } while (!esPrimoVariable);
            
            if (esPrimoVariable && numero != 0 && numero > 0) {
                System.out.println("El número " + numero + " es un primo positivo.");
            }

            if (esPrimoVariable && numero != 0 && numero < 0) {
                System.out.println("El número " + numero + " es un primo negativo.");
            }
        } while (numero != 0);
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        int absNumero = Math.abs(numero);
        if (absNumero == 1) {
            System.out.println("El número " + numero + " no es primo, es la unidad.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(absNumero); i++) {
            if (numero % i == 0) {
                System.out.println("El número " + numero + " no es primo.");
                return false;
            }
        }
        return true;
    }
}
