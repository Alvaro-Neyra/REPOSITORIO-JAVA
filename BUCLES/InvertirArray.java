package BUCLES;

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = new int[]{20, 30, 140, 20, 30, 40, 50, 60, 70, 80};
        int[] numerosInvertidos = new int[numeros.length];

        for (int i = numeros.length - 1, j = 0; i >= 0; i--, j++) {
            numerosInvertidos[j] = numeros[i];
        }

        imprimirArray(numerosInvertidos);
    }

    public static void imprimirArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|" + numeros[i] + "|");
        }
    }
}
