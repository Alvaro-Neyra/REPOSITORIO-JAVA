import java.util.InputMismatchException;
import java.util.Scanner;

public class DibujarCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        int longitud = 0;
        do {
            try {
                do {
                    System.out.println("Ingrese la longitud del cuadrado: ");
                    longitud = sc.nextInt();
                } while (longitud < 1);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero mayor a 1.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (error);

        dibujarCuadrado(longitud);
    }

    public static void dibujarLinea(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void dibujarLineaIncompleta(int longitud) {
        for (int i = 0; i < longitud; i++) {
            if (i == 0 || i == longitud - 1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    public static void dibujarCuadrado(int longitud) {
        for (int i = 0; i < longitud; i++) {
            if (i == 0 || i == longitud - 1) {
                dibujarLinea(longitud);
            } else {
                dibujarLineaIncompleta(longitud);
            }
        }
    }
}
