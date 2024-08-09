import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarElNumero {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        adivinarNumero();
    }

    public static int solicitarNumero() {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.print("Ingrese un numero: ");
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero.");
                error = true;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);

        return numero;
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void adivinarNumero() {
        int intentos = 0;
        int numeroAdivinar = numeroAleatorio(1, 20);
        int numeroIngresado = 0;
        do {
            intentos++;
            numeroIngresado = solicitarNumero();
            if (numeroIngresado < numeroAdivinar) {
                System.out.println("El numero a adivinar es mayor.");
            } else if (numeroIngresado > numeroAdivinar) {
                System.out.println("El numero a adivinar es menor.");
            }
        } while (numeroIngresado != numeroAdivinar);
        System.out.println("Felicidades, adivinaste el numero en " + intentos + " intentos.");
        sc.close();
    }
}
