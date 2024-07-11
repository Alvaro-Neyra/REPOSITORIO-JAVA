import java.util.Scanner;

public class SumandoElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);

        sc.close();
    }
}