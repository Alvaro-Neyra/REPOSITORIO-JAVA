import java.util.Scanner;

public class ContandoLosDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        int contadorNumeros = 0;
        String numeroAString = "";
        int numero = 0;
        do {
            error = false;
            try {
                System.out.print("Ingrese un numero entero: ");
                numero = sc.nextInt();
                numeroAString = String.valueOf(numero);
            } catch (Exception e) {
                System.out.println("Error al convertir el numero a cadena, vuelve a intentarlo.");
                sc.next();
                error = true;
            }
        } while (error);

        for (int i = 0; i < numeroAString.length(); i++) {
            if (Character.isDigit(numeroAString.charAt(i))) {
                contadorNumeros++;
            }
        }
        System.out.println("El numero " + numero + " tiene " + contadorNumeros + " digitos.");

        sc.close();
    }
}
