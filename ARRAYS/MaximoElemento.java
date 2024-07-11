import java.util.Scanner;

public class MaximoElemento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maximo = numeros[0];

        for (int i = 0 ; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El maximo elemento es: " + maximo);
        sc.close();
    }
}
