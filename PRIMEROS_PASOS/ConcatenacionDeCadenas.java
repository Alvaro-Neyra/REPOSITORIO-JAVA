import java.util.Scanner;

public class ConcatenacionDeCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu apellido: ");
        String apellido = sc.nextLine();

        nombre = nombre.concat(" ");
        nombre = nombre.concat(apellido);

        System.out.println("Tu nombre completo es: " + nombre);
        sc.close();
    }
}