import java.util.Scanner;

public class CadenaAEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        String cadena = sc.nextLine();
        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El numero introducido fue convertido exitosamente a entero y es: " + numero);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("No has introducido un número entero." + e.getMessage());
        } finally {
            System.err.println("La ejecución del programa ha finalizado.");
            sc.close();
        }
    }    
}
