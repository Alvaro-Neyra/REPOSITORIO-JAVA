import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Ingrese la letra a buscar: ");
        char letra = sc.next().charAt(0);

        int indice = palabra.indexOf(letra);

        if (indice == -1) {
            System.out.println("La letra no se encuentra en la palabra");
        } else {
            System.err.println("La letra se encuentra en la posición: " + indice);
        }
    
        sc.close();
    }
}
