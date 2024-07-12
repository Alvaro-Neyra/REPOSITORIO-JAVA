package BUCLES;

public class OrdenInverso {
    public static void main(String[] args) {
        int[] numeros = new int[]{20, 30, 140, 20, 30, 40, 50, 60, 70, 80};

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print("|" + numeros[i] + "|");
        }
    }
}
