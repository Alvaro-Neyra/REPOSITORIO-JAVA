import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite un numero positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);
        

        double resultado = calcularRaizCuadrada(numero);

        System.out.println("La raiz cuadrada de " + numero + " es: " + resultado);
        sc.close();
    }

    public static double calcularRaizCuadrada(int numero) {
        return Math.sqrt(numero);
    }
}
