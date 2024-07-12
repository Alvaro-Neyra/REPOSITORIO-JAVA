package BUCLES;
import java.util.Scanner;

public class ImprimiendoElementos {
    public static void main(String[] args) {
        int [] numeros = {20, 30, 40, 800, 10};

        for (int i : numeros) {
            System.out.print("| " + i + " |");
        }
    }
}
