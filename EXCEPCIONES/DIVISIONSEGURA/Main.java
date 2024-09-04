package DIVISIONSEGURA;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int numerador = numeroSeguro("Ingrese el numerador: ");
        int denominador = numeroSeguro("Ingrese el denominador: ");
        
        divisionSegura(numerador, denominador);
    }

    static int numeroSeguro(String mensaje) {
        int numerador = 0;
        boolean error = false;
        do {
            error = false;
            try {
                numerador = obtenerNumero(mensaje);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);
        return numerador;
    }

    static int obtenerNumero(String mensaje) throws Exception{
        boolean error = false;
        int numero= 0;
        do {
            error = false;
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                if (numero == 0) {
                    throw new Exception("Error: El numero no puede ser 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    static void divisionSegura(int numerador, int denominador) {
        int resultado = numerador / denominador;
        System.out.println("El resultado de la división es: " + resultado);
    }
}