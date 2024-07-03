import java.util.Scanner;

public class Opciones {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Opcion 1: Guardar");
        System.out.println("Opcion 2: Cargar");
        System.out.println("Opcion 3: Salir");

        System.out.println("Elige una opción:");
        int opcion = miScanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Guardando...");
                break;
            case 2:
                System.out.println("Cargando...");
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        miScanner.close();
    }
}
