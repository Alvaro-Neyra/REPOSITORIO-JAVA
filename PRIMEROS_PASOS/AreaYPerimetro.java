import java.util.Scanner;

public class AreaYPerimetro {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("SELECCIONAR FIGURA GEOMETRICA: ");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");

        int opcion = miScanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Introduce el radio del circulo: ");
                double radio = miScanner.nextDouble();

                System.out.print("Deseas calcular el area o el perimetro? (1. Area, 2. Perimetro): ");
                int opcion2 = miScanner.nextInt();

                switch (opcion2) {
                    case 1 -> {
                        double area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El area del circulo es: " + area);
                    }
                    case 2 -> {
                        double perimetro = 2 * Math.PI * radio;
                        System.out.println("El perimetro del circulo es: " + perimetro);
                    }
                }
            }
            case 2 -> { 
                System.out.print("Introducte la base del rectangulo: ");
                int base = miScanner.nextInt();
                System.out.print("Introduce la altura del rectangulo: ");
                int altura = miScanner.nextInt();

                System.out.print("Deseas calcular el area o el perimetro? (1. Area, 2. Perimetro): ");
                int opcion2 = miScanner.nextInt();

                switch (opcion2) {
                    case 1 -> {
                        int area = base * altura;
                        System.out.println("El area del rectangulo es: " + area);
                    }
                    case 2 -> {
                        int perimetro = 2 * (base + altura);
                        System.out.println("El perimetro del rectangulo es: " + perimetro);
                    }
                }
            }
            default -> System.out.println("Opción no válida");
        }
        miScanner.close();
    }
}
