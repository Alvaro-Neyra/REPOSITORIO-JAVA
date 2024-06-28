import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int primerNumero = enteros.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int segundoNumero = enteros.nextInt();

        boolean resultadoDeComparacion = primerNumero > segundoNumero ? true : false;

        System.out.println("El primer numero es mayor que el segundo: " + resultadoDeComparacion);

    }
}
