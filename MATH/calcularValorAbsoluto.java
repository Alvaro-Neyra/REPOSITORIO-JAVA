import java.util.Scanner;

public class calcularValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int valorAbsoluto = valorAbsoluto(numero);

        System.out.println("El valor absoluto del numero ingresado es: " + valorAbsoluto);

        sc.close();
    }

    public static int valorAbsoluto(int numero) {
        return Math.abs(numero);
    }
}
