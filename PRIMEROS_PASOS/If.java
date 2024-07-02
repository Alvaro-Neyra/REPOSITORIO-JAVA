import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = miScanner.nextInt();

        if (numero < 0) {
            System.out.println("Este es un numero negativo"); 
        } else if (numero == 0) {
            System.out.println("Este es un numero nulo");
        } else {
            System.out.println("Este es un numero positivo");
        }
        miScanner.close();
    }
}
