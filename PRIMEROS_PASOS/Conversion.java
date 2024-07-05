import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = pedirTexto(sc);

        String palabraMayuscula = convertirMayuscula(palabra);

        String palabraMinuscula = convertirMinuscula(palabra);

        mostrarResultado(palabraMayuscula, palabraMinuscula);

        sc.close();
    }

    public static String pedirTexto(Scanner sc) {
        System.out.print("Ingrese una palabra: ");
        return sc.nextLine();
    }

    public static String convertirMayuscula(String palabra) {
        return palabra.toUpperCase();
    }

    public static String convertirMinuscula(String palabra) {
        return palabra.toLowerCase();
    }

    public static void mostrarResultado(String palabraMayuscula, String palabraMinuscula) {
        System.out.println("La palabra en MAYUSCULA: " + palabraMayuscula);
        System.out.println("La palabra en minuscula: " + palabraMinuscula);
    }
}
