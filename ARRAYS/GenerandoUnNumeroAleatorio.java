import java.util.Scanner;

public class GenerandoUnNumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Se generaran numeros aleatorios en el arreglo de tamanio 6 y se contaran solo los pares.");

        System.out.println("Ingresa el numero maximo para el rango");

        int max = sc.nextInt();

        int[] numeros = new int[6];
        numeros[0] = generarNumeroAleatorio(1, max);
        numeros[1] = generarNumeroAleatorio(1, max);
        numeros[2] = generarNumeroAleatorio(1, max);
        numeros[3] = generarNumeroAleatorio(1, max);
        numeros[4] = generarNumeroAleatorio(1, max);
        numeros[5] = generarNumeroAleatorio(1, max);

        System.out.println("Numeros generados");
        System.out.print("|");
        System.out.print(numeros[0] + "|" + " |");
        System.out.print(numeros[1] + "|" + " |");
        System.out.print(numeros[2] + "|" + " |");
        System.out.print(numeros[3] + "|" + " |");
        System.out.print(numeros[4] + "|" + " |");
        System.out.print(numeros[5] + "|");

        int contadorPares = 0;

        if (numeros[0] % 2 == 0) {
            contadorPares++;
        }

        if (numeros[1] % 2 == 0) {
            contadorPares++;
        }

        if (numeros[2] % 2 == 0) {
            contadorPares++;
        }

        if (numeros[3] % 2 == 0) {
            contadorPares++;
        }

        if (numeros[4] % 2 == 0) {
            contadorPares++;
        }

        if (numeros[5] % 2 == 0) {
            contadorPares++;
        }

        System.out.println("\nNumeros pares en el arreglo: " + contadorPares);
        sc.close();
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
