import java.util.Scanner;

public class Reemplazo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = solicitarTexto(sc);

        char letraAReemplazar = solicitarReemplazarLetra(sc);

        char letraDeReemplazo = solicitarLetraDeReemplazo(sc);

        String palabraReemplazada = reemplazarLetra(palabra, letraAReemplazar, letraDeReemplazo);

        mostrarResultado(palabraReemplazada);

        sc.close();
    }    

    public static String solicitarTexto(Scanner sc) {
        System.out.print("Ingrese una palabra: ");
        return sc.nextLine();
    }

    public static char solicitarReemplazarLetra(Scanner sc) {
        System.out.print("Ingrese la letra a reemplazar: ");
        return sc.next().charAt(0);
    }

    public static char solicitarLetraDeReemplazo(Scanner sc) {
        System.out.print("Ingrese la letra de reemplazo: ");
        return sc.next().charAt(0);
    }

    public static String reemplazarLetra(String palabra, char letraAReemplazar, char letraDeReemplazo) {
        return palabra.replace(letraAReemplazar, letraDeReemplazo);
    }

    public static void mostrarResultado(String palabraReemplazada) {
        System.out.println("La palabra reemplazada es: " + palabraReemplazada);
    }
}
