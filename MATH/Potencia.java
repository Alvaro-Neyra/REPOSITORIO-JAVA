import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base a potenciar:");
        double base = sc.nextDouble();

        System.out.print("Ingrese el exponente:");
        double exponente = sc.nextDouble();
        
        double resultado = calcularPotencia(base, exponente);

        System.out.println("El resultado de la potencia es: " + resultado);

        sc.close();

    }

    public static double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
