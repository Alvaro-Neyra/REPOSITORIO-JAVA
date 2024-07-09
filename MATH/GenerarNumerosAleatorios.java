import java.util.Scanner;

public class GenerarNumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el valor mínimo: ");
        int min = sc.nextInt();

        System.out.print("Digite el valor máximo: ");
        int max = sc.nextInt();

        int numeroAleatorio = generarNumeroAleatorio(min, max);

        System.out.println("El número aleatorio generado es: " + numeroAleatorio);

        sc.close();       
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) Math.floor((Math.random() * (max - min + 1) + min));
    }
}
