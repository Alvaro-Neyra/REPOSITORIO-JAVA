import java.util.InputMismatchException;
import java.util.Scanner;

public class DibujarGraficoDeBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[4];
        boolean error = true;
        int longitud = 0;
        for (int i = 0 ; i < valores.length; i++) {
            error = true;
            do {
                try {
                    do {
                        System.out.print("Ingrese la longitud del gráfico de barras para el posicion " + i + ": ");
                        longitud = sc.nextInt();
                    } while (longitud < 0);
                    error = false;
                    valores[i] = longitud;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes introducir un número entero mayor a 1." + " en la posición " + i);
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine();
                }
            } while (error);
        }

        System.out.println("Gráfico de barras:");
        dibujarGraficoDeBarras(valores);
        sc.close();
    }

    public static void dibujarLinea(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void dibujarGraficoDeBarras(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            dibujarLinea(valores[i]);
        }
        System.out.println();
    }
}
