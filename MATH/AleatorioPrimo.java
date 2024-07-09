import java.util.Scanner;

public class AleatorioPrimo {
    public static void main(String[] args) {
        int numeroLimite = 0;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Digite un numero entre 1 y 30: ");
            numeroLimite = sc.nextInt();

        } while (numeroLimite < 1 || numeroLimite > 30);
        sc.close();

        int numeroAleatorio = generarNumeroAleatorioEntreLimites(1, numeroLimite);

        // RAIZ CUADRADA:

        double raizCuadrada = Math.sqrt(numeroAleatorio);

        System.out.println("La raiz cuadrada de " + numeroAleatorio + " es: " + raizCuadrada);

        // Verificar si es primo

        boolean esPrimo = true;
        for (int i = 2; i < raizCuadrada; i++) {
            if (numeroAleatorio % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (numeroAleatorio == 1) esPrimo = false;

        if (esPrimo) {
            System.out.println("El numero aleatorio entre 1 y " + numeroLimite + " es: " + numeroAleatorio + " y es primo");
        } else {
            if (numeroAleatorio == 1) {
                System.out.println("El numero aleatorio entre 1 y " + numeroLimite + " es: " + numeroAleatorio + " y el numero es la unidad");
            } else {
                System.out.println("El numero aleatorio entre 1 y " + numeroLimite + " es: " + numeroAleatorio + " y no es primo");
            }
        }
    }

    public static int generarNumeroAleatorioEntreLimites(int limiteInferior, int limiteSuperior) {
        return (int)(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
    }
}
