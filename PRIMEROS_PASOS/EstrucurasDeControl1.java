import java.util.Scanner;

public class EstrucurasDeControl1 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = miScanner.nextInt();

        if (numero >= 0 && numero <= 100) {
            if (numero >= 90 && numero <= 100) {
                System.out.println("Tiene una calificacion de A");
            } else if (numero <= 89 && numero >= 80) {
                System.out.println("Tiene una calificacion de B");
            } else if (numero >= 70 && numero <= 79) {
                System.out.println("Tiene una calificacion C");
            } else if (numero >= 60 && numero <= 69) {
                System.out.println("Tiene una calificacion de D");
            } else {
                System.out.println("Tiene una calificacion de F");
            }
        } else {
            System.out.println("El numero ingresado esta fuera del rango valido entre el 0 y el 100");
        }

        miScanner.close();
    }
}
