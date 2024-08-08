import java.util.Scanner;

public class TablaDeMultiplicar {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaDeMultiplicar(numero);
    }

    public static int pedirNumero() {
        System.out.print("Ingrese un número para imprimir la tabla de multiplicar: ");
        return sc.nextInt();
    }

    public static void imprimirTablaDeMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}