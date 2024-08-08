import java.util.Scanner;
public class TablaDeMultplicar2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasDeMultiplicar(numeros);
    }

    public static int[] pedirNumeros() {
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " : ");
            numeros[i] = sc.nextInt();
            System.out.println();
        }
        return numeros;
    }

    public static void imprimirTablasDeMultiplicar(int[] numeros) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(numeros[i] + " x " + j + " = " + numeros[i] * j);
            }
            System.out.println();
        }
    }
}
