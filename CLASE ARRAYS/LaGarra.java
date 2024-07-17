import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class LaGarra {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            
            int[] numeros = new int[30];
            
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = generarAleatorio(1, 100);
            }
            
            System.out.println("Este es el arreglo generado: ");
            mostrarArray(numeros);
            
            int min;
            do {
                System.out.print("\nIngresa un numero de indice minimo del (0 al 29): ");
                min = sc.nextInt();
            } while (min < 0 || min >= numeros.length);
            
            
            int max;
            do {
                System.out.print("\nIngresa un numero de indice maximo del (0 al 29): ");
                max = sc.nextInt();
            } while (max < 0 || max >= numeros.length);
            
            int[] arregloRangoCopia = Arrays.copyOfRange(numeros, min, max);
            
            System.out.println("Este es el arreglo generado desde el indice min y el max: ");
            
            mostrarArray(arregloRangoCopia);
            
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("| " + numeros[i] + " |");
        }
    }

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
