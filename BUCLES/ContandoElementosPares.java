package BUCLES;

public class ContandoElementosPares {
    public static void main(String[] args) {
        int[] arregloDeAleatorios = new int[10];

        for (int i = 0; i < arregloDeAleatorios.length; i++) {
            arregloDeAleatorios[i] = generarAleatorio(1, 99);
        }

        int contadorPares = 0;

        for (int elemento: arregloDeAleatorios) {
            if (elemento % 2 == 0) {
                contadorPares++;
            }
        }

        imprimirArray(arregloDeAleatorios);
        System.out.println();
        System.out.println("Hay un total de " + contadorPares + " números pares en el arreglo.");
    }

    public static int generarAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void imprimirArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|" + numeros[i] + "|");
        }
    }
}
