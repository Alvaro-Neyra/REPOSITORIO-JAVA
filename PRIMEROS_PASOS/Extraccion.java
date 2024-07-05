import java.util.Scanner;

public class Extraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase = introducirFrase(sc);

        int inicio = introducirIndiceInicio(sc);

        int indiceFinal = introducirIndiceFinal(sc);

        String nuevaCadena = frase.substring(inicio, indiceFinal);

        mostrarRespuesta(nuevaCadena);

        sc.close();
    }

    public static String introducirFrase(Scanner sc) {
        System.out.print("Introduce una frase: ");

        String frase = sc.nextLine();
        return frase;
    }

    public static int introducirIndiceInicio(Scanner sc) {
        System.out.print("Introduce la posicion al inicio: ");
        int inicio = sc.nextInt();
        return inicio;
    }

    public static int introducirIndiceFinal(Scanner sc) {
        System.out.print("Introduce la posicion al final: ");
        int indiceFinal = sc.nextInt();
        return indiceFinal;
    }
    
    public static String extraerSubCadena(String frase, int inicio, int indiceFinal) {
        String nuevaCadena = frase.substring(inicio, indiceFinal);
        return nuevaCadena;
    }

    public static void mostrarRespuesta(String subCadena) {
        System.out.println("La subcadena extraida es: " + subCadena);
    }
}
