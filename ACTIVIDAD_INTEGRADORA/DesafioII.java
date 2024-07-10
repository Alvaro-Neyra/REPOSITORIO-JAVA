import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DesafioII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();

        boolean tieneLongitudMinima = password.length() >= 8;
        boolean tieneCaracterMayuscula = contieneCaracter(password, "[A-Z]");
        boolean tieneCaracterMinuscula = contieneCaracter(password, "[a-z]");
        boolean tieneNumero = contieneCaracter(password, "[0-9]");
        boolean caracteresEspeciales = contieneCaracter(password, "[^A-Za-z0-9]");

        if (tieneLongitudMinima && tieneCaracterMayuscula && tieneCaracterMinuscula && tieneNumero && caracteresEspeciales) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura.");

            List<String> errores = new ArrayList<>();

            if (!tieneLongitudMinima) {
                errores.add("al menos 8 caracteres");
            }
            if (!tieneCaracterMayuscula) {
                errores.add("al menos una letra mayúscula");
            }
            if (!tieneCaracterMinuscula) {
                errores.add("al menos una letra minúscula");
            }
            if (!tieneNumero) {
                errores.add("al menos un número");
            }
            if (!caracteresEspeciales) {
                errores.add("al menos un carácter especial");
            }

            imprimirErrores(errores);
        }
    }

    private static boolean contieneCaracter(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    private static void imprimirErrores(List<String> errores) {
        int size = errores.size();
        if (size == 1) {
            System.out.println("La contraseña debe tener " + errores.get(0) + ".");
        } else if (size == 2) {
            System.out.println("La contraseña debe tener " + errores.get(0) + " y " + errores.get(1) + ".");
        } else if (size > 2) {
            System.out.print("La contraseña debe tener ");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(errores.get(i) + ", ");
            }
            System.out.println("y " + errores.get(size - 1) + ".");
        }
    }
}
