import java.util.Scanner;
import java.util.Arrays;


public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarAleatorio(1, 100);
        }

        /* PARA REALIZAR EL ALGORITMO DE BUSQUEDA BINARIA TENEMOS QUE PRIMERO ORDENAR EL ARREGLO DE FORMA ASCENDENTE */

        Arrays.sort(numeros);

        mostrarArray(numeros);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el numero a buscar: ");

        int numero = sc.nextInt();
        
        /* EL METODO BINARYSEARCH DEVUELVE UN NUMERO MAYOR A 0 SI EL ELEMENTO A BUSCAR ESTA EN EL ARREGLO, SI NO ESTA EN EL ARREGLO DEVUELVE -1*/
        int indice = Arrays.binarySearch(numeros, numero);

        if (indice >= 0) {
            System.out.println("El numero " + numero + " se encuentra en la posicion " + indice);
        } else {
            System.out.println("El numero " + numero + " no se encuentra en el arreglo");
        }
    }

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("| " + numeros[i] + " |");
        }
    }

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
