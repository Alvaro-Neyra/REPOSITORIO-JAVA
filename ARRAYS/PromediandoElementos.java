import java.util.Scanner;

public class PromediandoElementos {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int suma = 0;
        int contadorElementos = 4;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = suma / contadorElementos;

        System.out.println("El promedio de los elementos es: " + promedio);

        sc.close();
    }
}
