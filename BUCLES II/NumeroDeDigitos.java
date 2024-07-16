import java.util.Scanner;

public class NumeroDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un numero entero: ");
            int numero = sc.nextInt();
            int numeroDeDigitos = 0;
            int numeroAuxiliar = numero;

            while (numeroAuxiliar != 0) {
                numeroAuxiliar /= 10;
                numeroDeDigitos++;
            }

            System.out.println("El numero " + numero + " tiene " + numeroDeDigitos + " digitos.");

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }
}
