import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Rellenar {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            
            int tamanio;
            do {
                System.out.print("Ingresa el tamaño del arreglo: ");
                tamanio = sc.nextInt();
            } while (tamanio < 0);
            
            
            System.out.print("Ingresa el numero que deseas rellenar el arreglo: ");
            int numero = sc.nextInt();
            
            int[] arregloGenerado = new int[tamanio];
            
            Arrays.fill(arregloGenerado, numero);
            
            System.out.println("Este es el arreglo generado: ");
            
            mostrarArray(arregloGenerado);
            
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
        System.out.println();
    }
}
