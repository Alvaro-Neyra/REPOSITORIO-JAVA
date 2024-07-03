import java.util.Scanner;

public class Figuras {

    public static void circulo(Scanner miScanner) {
        System.out.print("Introduce el radio del circulo: ");

        double radio = miScanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);
    }

    public static void cuadrado(Scanner miScanner) {
        System.out.print("Introduce el lado del cuadrado: ");
        int lado = miScanner.nextInt();

        int areaTotal = lado * lado;

        System.out.println("El area del cuadrado es: " + areaTotal);
    }

    public static void triangulo(Scanner miScanner) {
        System.out.print("Introduce la base del triangulo: ");
        int base = miScanner.nextInt();
        System.err.print("Introduce la altura del triangulo: ");
        int altura = miScanner.nextInt();

        int areaTotal = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + areaTotal);
    }

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.println("SELECCIONAR FIGURA GEOMETRICA: ");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");

        int opcion = miScanner.nextInt();

        switch (opcion) {
            case 1:
                circulo(miScanner);
                break;
            case 2:
                cuadrado(miScanner);
                break;
            case 3:
                triangulo(miScanner);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        miScanner.close();
    }
}
