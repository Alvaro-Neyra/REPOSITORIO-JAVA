import java.util.Scanner;

public class ComparacionDeCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra1 = pedirPalabra1(sc);
        String palabra2 = pedirPalabra2(sc);
        mostrarResultado(palabra1, palabra2);
        sc.close();
    }

    public static String pedirPalabra1(Scanner sc) {
        System.out.print("Introduce la primera palabra a comparar: ");
        return sc.nextLine();
    }

    public static String pedirPalabra2(Scanner sc) {
        System.out.print("Introduce la segunda palabra a comparar: ");
        return sc.nextLine();
    }

    public static void mostrarResultado(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }
    }

}
