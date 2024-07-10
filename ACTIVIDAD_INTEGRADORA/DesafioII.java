import java.util.Scanner;

public class DesafioII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();
        boolean tieneLongitudMinima = password.length() >= 8;
        boolean tieneCaracterMayuscula = password.matches("[A-Z]");
        boolean tieneCaracterMinuscula = password.matches("[a-z]");
        boolean tieneNumero = password.matches("[0-9]");
        boolean caracteresEspeciales = password.matches("[^A-Za-z0-9]");

        if (tieneLongitudMinima && tieneCaracterMayuscula && tieneCaracterMinuscula && tieneNumero && caracteresEspeciales) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura.");

            if (!tieneLongitudMinima) {
                System.out.print("La contraseña debe tener al menos 8 caracteres.");
            } else if (!tieneCaracterMayuscula) {
                System.out.print("La contraseña debe tener al menos una letra mayúscula.");
            } else if (!tieneCaracterMinuscula) {
                System.out.print("La contraseña debe tener al menos una letra minúscula.");
            } else if (!tieneNumero) {
                System.out.print("La contraseña debe tener al menos un número.");
            } else if (!caracteresEspeciales) {
                System.out.print("La contraseña debe tener al menos un carácter especial.");
            }
        }
    }
}
