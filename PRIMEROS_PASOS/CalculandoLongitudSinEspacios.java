import java.util.Scanner;

public class CalculandoLongitudSinEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = pedirPalabra(sc);

        String palabraSinEspaciosEnLosExtremos = palabraSinEspaciosExtremos(palabra);

        String palabraSinEspaciosTotales = palabraSinEspacios(palabraSinEspaciosEnLosExtremos);

        int longitud = obtenerLongitud(palabraSinEspaciosTotales);

        mostrarResultado(longitud);
        
        sc.close();
    }

    public static String pedirPalabra(Scanner sc) {
        System.out.print("Introduce una palabra: ");
        return sc.nextLine();
    }

    public static String palabraSinEspaciosExtremos(String palabra) {
        return palabra.trim();
    }

    public static String palabraSinEspacios(String palabra) {
        return palabra.replace(" ", "");
    }

    public static int obtenerLongitud(String palabra) {
        return palabra.length();
    }

    public static void mostrarResultado(int longitud) {
        System.out.println("Longitud de la palabra sin espacios: " + longitud);
    }

}
