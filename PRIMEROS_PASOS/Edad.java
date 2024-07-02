import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = miScanner.nextInt();

        if (edad > 0) {
            if (edad < 18) {
                System.out.println("Eres menor de edad");
            } else if (edad >= 18 && edad <= 64) {
                System.out.println("Eres adulto");
            } else if (edad >= 65) {
                System.out.println("Eres adulto mayor");
            }
        } else {
            System.out.println("Edad no valida");
        }

        miScanner.close();
    }   
}
