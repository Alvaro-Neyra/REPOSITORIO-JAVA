import java.util.Arrays;

public class ComparaArreglos {
    public static void main(String[] args) {
        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];

        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = generarAleatorio(1, 20);
        }

        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = generarAleatorio(1, 20);
        }

        mostrarArray(numeros1);
        mostrarArray(numeros2);

        

        if (Arrays.equals(numeros1, numeros2)) {
            System.out.println("Los arreglos son iguales");
        } else {
            System.out.println("Los arreglos son diferentes");
        }
    }

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("| " + numeros[i] + " |");
        }
        System.out.println();
    }

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
