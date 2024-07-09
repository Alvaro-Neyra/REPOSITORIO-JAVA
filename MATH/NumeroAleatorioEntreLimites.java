import java.util.Scanner;

public class NumeroAleatorioEntreLimites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el limite inferior: ");
        int limiteInferior = sc.nextInt();
        System.out.print("Ingrese el limite superior: ");
        int limiteSuperior = sc.nextInt();

        int numeroAleatorio = generarNumeroAleatorioEntreLimites(limiteInferior, limiteSuperior);

        System.out.println("El numero aleatorio entre " + limiteInferior + " y " + limiteSuperior + " es: " + numeroAleatorio);
        sc.close();
    }

    public static int generarNumeroAleatorioEntreLimites(int limiteInferior, int limiteSuperior) {
        return (int) (Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
}
