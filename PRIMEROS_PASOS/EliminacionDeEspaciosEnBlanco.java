import java.util.Scanner;

public class EliminacionDeEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = pedirPalabra(sc);
        String fraseSinEspacios = obtenerFraseSinEspacios(frase);
        mostrarResultado(fraseSinEspacios);
        sc.close();
    }   

    public static String pedirPalabra(Scanner sc) {
        System.out.print("Introduce una palabra: ");
        return sc.nextLine();
    }

    public static String obtenerFraseSinEspacios(String frase) {
        return frase.trim();
    }

    public static void mostrarResultado(String fraseSinEspacios) {
        System.out.println("Frase sin espacios en blanco al principio y al final: " + fraseSinEspacios);
    }
}
