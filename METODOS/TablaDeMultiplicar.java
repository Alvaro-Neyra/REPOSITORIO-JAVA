import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaDeMultiplicar(numero);
        sc.close();
    }

    public static int pedirNumero() {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.print("Ingrese un número para imprimir la tabla de multiplicar: ");
                numero = sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero");
                error = true;
                sc.nextLine();
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);
        return numero;
    }

    public static void imprimirTablaDeMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}