import java.util.Scanner;

public class ValidacionContrasena {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String contrasena = "";
        do {
            contrasena = solicitarContrasena();
            mostrarMensaje(contrasena);
        } while (!esSegura(contrasena));
        sc.close();
    }

    public static String solicitarContrasena() {
        System.out.print("Ingrese una contraseña: ");
        return sc.nextLine();
    }

    public static boolean tieneLaLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    public static boolean tieneMinuscula(String contrasena) {
        return contrasena.matches(".*[a-z]+.*");
    }

    public static boolean tieneMayuscula(String contrasena) {
        return contrasena.matches(".*[A-Z]+.*");
    }

    public static boolean tieneNumero(String contrasena) {
        return contrasena.matches(".*[0-9]+.*");
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        return contrasena.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
    }

    public static boolean esSegura(String contrasena) {
        return tieneLaLongitudCorrecta(contrasena) && tieneMinuscula(contrasena) && tieneMayuscula(contrasena) && tieneNumero(contrasena) && tieneCaracterEspecial(contrasena);
    }

    public static void mostrarMensaje(String contrasena) {
        String mensaje = "La contrasena debe ";

        String[] mensajeFinal = new String[5];

        mensajeFinal[0] = !tieneLaLongitudCorrecta(contrasena) ? "tener al menos 8 caracteres" : "";
        mensajeFinal[1] = !tieneMinuscula(contrasena) ? "tener al menos una minuscula" : "";
        mensajeFinal[2] = !tieneMayuscula(contrasena) ? "tener al menos una mayuscula" : "";
        mensajeFinal[3] = !tieneNumero(contrasena) ? "tener al menos un numero" : "";
        mensajeFinal[4] = !tieneCaracterEspecial(contrasena) ? "tener al menos un caracter especial" : "";

        for (int i = 0; i < mensajeFinal.length - 1; i++) {
            if (!mensajeFinal[i].equals("")) {
                mensaje += mensajeFinal[i] + ", ";
            }
        }

        mensaje += mensajeFinal[mensajeFinal.length - 1] + ".";

        if (esSegura(contrasena)) {
            System.out.println("Contraseña valida.");
        } else {
            System.out.println(mensaje);
        }
    }
}



