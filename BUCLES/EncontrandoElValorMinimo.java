package BUCLES;
import java.util.Scanner;

public class EncontrandoElValorMinimo {
    public static void main(String[] args) {
        int[] numeros = {3000, 30, 40, 800, 10, 1000, 2000, 20, 4000, 5000};
        

        int min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("El valor mínimo es: " + min);
    }
}
