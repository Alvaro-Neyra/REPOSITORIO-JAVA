import java.util.Scanner;

public class CalcularSumaAcumulada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long suma = 0;
        long numero = 0;

        while (true) {
            System.out.print("Introduce un número entero positivo (0 para terminar): ");
            numero = sc.nextLong();

            if (numero == 0) {
                break;
            } else {
                suma += numero;
            }
        }

        sc.close();

        System.out.println("La suma acumulada es: " + suma);
    }
}
