import java.util.Scanner;

public class Papeada {
    public static void main(String[] args)  {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = miScanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = miScanner.nextInt();

        System.out.println("Mi nombre es: " + nombre + " y tengo una edad de:  " + edad + " años.");

        miScanner.close();
    }
}
