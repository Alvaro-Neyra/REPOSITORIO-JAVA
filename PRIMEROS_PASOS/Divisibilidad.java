import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingresar un numero: ");
        Double numero = miScanner.nextDouble();

        // Si es divisible por 5
        if (numero % 3 == 0 && numero % 5 ==4 0) {
            System.out.println("El numero " + numero + " es divisible por 3 y 5");
        }
        else if (numero % 5 == 0) {
            System.out.println("El numero " + numero + " es divisible por 5");
        } else if (numero % 3 == 0) {
            System.out.println("El numero " + numero + "es divisible por 3");
        } else {
            System.out.println("El numero " + numero + " no es divisible por 3 ni por 5");
        }
        miScanner.close();
    }
}
