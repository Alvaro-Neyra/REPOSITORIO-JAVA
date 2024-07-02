import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precio = miScanner.nextDouble();

        if (precio >= 100) {
            double descuento = (precio * 10) / 100;
            double precioFinal = precio - descuento;
            System.out.println("El precio final es: " + precioFinal + " con un descuento de: " + descuento);
        } else {
            System.out.println("El precio final es: " + precio + " sin descuento.");
        }
    }
}
