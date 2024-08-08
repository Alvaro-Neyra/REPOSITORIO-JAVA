import java.util.InputMismatchException;
import java.util.Scanner;
public class TablaDeMultplicar2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasDeMultiplicar(numeros);
        sc.close();
    }

    public static int[] pedirNumeros() {
        boolean error = false;
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            do {
                error = false;
                try {
                    System.out.print("Ingrese el número " + (i + 1) + " : ");
                    numeros[i] = sc.nextInt();
                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número entero");
                    error = true;
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    error = true;
                    sc.nextLine();
                }
            } while (error);
        }
        return numeros;
    }

    public static void imprimirTablasDeMultiplicar(int[] numeros) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(numeros[i] + " x " + j + " = " + numeros[i] * j);
            }
            System.out.println();
        }
    }
}
