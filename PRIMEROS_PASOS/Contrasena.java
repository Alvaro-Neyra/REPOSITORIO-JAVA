import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        String contrasena = "3gg2@24";

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingrese la contrasena: ");
        String contrasenaIngresada = miScanner.nextLine();

        if (contrasenaIngresada.equals(contrasena)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        miScanner.close();
    }
}
