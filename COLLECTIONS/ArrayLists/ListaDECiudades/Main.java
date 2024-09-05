import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        boolean agregar = true;
        do {
            System.out.println("Ingresa un nombre de la ciudad: ");
            String ciudad = sc.nextLine();
            list.add(ciudad);
            System.out.println("¿Deseas agregar otra ciudad? (s/n)");
            String respuesta = sc.nextLine();
            if (respuesta.equals("n")) {
                agregar = false;
                System.out.println("Las ciudades ingresadas son: ");
                for (String c : list) {
                    System.out.println(c);
                }
            } else {
                agregar = true;
            }
        } while (agregar);
    }
}