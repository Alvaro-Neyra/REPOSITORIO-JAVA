package BUCLES;

public class AcumularSuma {
    public static void main(String[] args) {
        int[] newArray = new int[]{20, 30, 140, 20, 30, 40, 50, 60, 70, 80, 14, 12, 17, 99, 65, 82, 23, 45};

        int suma = 0;

        for (int i = 0; i < newArray.length; i++) {
            suma += newArray[i];
            newArray[i] = suma;
        }

        imprimirArray(newArray);
    }

    public static void imprimirArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|" + numeros[i] + "|");
        }
    }
}
