import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        int contadorPares = 0;
        int contadorImpares = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número entero positivo (0 para terminar): ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            } else if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        sc.close();

        System.out.println("Números pares: " + contadorPares);
        System.out.println("Números impares: " + contadorImpares);
    }
}
