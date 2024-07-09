import java.util.Scanner;

public class RedondearNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número: ");
        double numero = sc.nextDouble();

        double numeroRedondeado = redondearNumero(numero);

        System.out.println("El número redondeado es: " + numeroRedondeado);

        sc.close();
    }

    public static double redondearNumero(double numero) {
        return Math.round(numero);
    }
}
