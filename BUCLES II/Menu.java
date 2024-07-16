import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int opcion;
            System.out.println("Bienvenido a la tienda online.");
            System.out.println("Por favor, seleccione una opcion: ");
            mostrarMenu();
            do {
                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 5);
            
            switch (opcion) {
                case 1:
                System.out.println("Ha seleccionado la opcion de comprar producto.");
                break;
                case 2:
                System.out.println("Ha seleccionado la opcion de realizar devolucion.");
                break;
                case 3:
                System.out.println("Ha seleccionado la opcion de ver mis pedidos.");
                break;
                case 4:
                System.out.println("Ha seleccionado la opcion de preguntas frecuentes.");
                break;
                case 5:
                System.out.println("Ha seleccionado la opcion de salir.");
                break;
            }

            System.out.println("Gracias por usar nuestra tienda online.");
            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe introducir un numero entero.");
            main(args);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }

    public static void mostrarMenu() {
        System.out.println("1. Comprar producto.");
        System.out.println("2. Realizar devolucion.");
        System.out.println("3. Ver mis pedidos.");
        System.out.println("4. Preguntas frecuentes.");
        System.out.println("5. Salir.");
    }
}