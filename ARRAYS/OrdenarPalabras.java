import java.util.Scanner;

public class OrdenarPalabras {
    public static void main(String[] args) {
        String[] nombres = new String[4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 4 nombres");

        System.out.print("Ingresa el primer nombre: ");
        nombres[0] = sc.nextLine();
        System.out.print("Ingresa el segundo nombre: ");
        nombres[1] = sc.nextLine();
        System.out.print("Ingresa el tercer nombre: ");
        nombres[2] = sc.nextLine();
        System.out.print("Ingresa el cuarto nombre: ");
        nombres[3] = sc.nextLine();

        System.out.println("Nombres ingresados");
        System.out.print("|");
        System.out.print(nombres[0] + "|" + " |");
        System.out.print(nombres[1] + "|" + " |");
        System.out.print(nombres[2] + "|" + " |");
        System.out.print(nombres[3] + "|");

        System.out.println("\nNombres ordenados");

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length - 1; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    String aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }

        System.out.print("Nombres ordenados");
        System.out.print("|");
        System.out.print(nombres[0] + "|" + " |");
        System.out.print(nombres[1] + "|" + " |");
        System.out.print(nombres[2] + "|" + " |");
        System.out.print(nombres[3] + "|");
        sc.close();
    }
}
