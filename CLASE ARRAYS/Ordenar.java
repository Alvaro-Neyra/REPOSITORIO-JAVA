import java.util.Arrays;
import java.util.Collections;


public class Ordenar{
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numerosOrdenadosDescendente = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarAleatorio(1, 100);
        }

        System.out.println("Array desordenado");
        mostrarArray(numeros);


        Arrays.sort(numeros);


        for (int i = 0 ; i < numeros.length; i++) {
            numerosOrdenadosDescendente[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println();
        System.out.println("Array ordenado de forma descendentemente");
        mostrarArray(numerosOrdenadosDescendente);
    }

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| " + array[i] + " |");
        }
    }
}