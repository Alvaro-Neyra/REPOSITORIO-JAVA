import java.util.Scanner;
import java.util.InputMismatchException;

public class RellenarArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int longitud = solicitarNumero("Ingrese la longitud del array: ");
        int[] array = new int[longitud];
        rellenarArray(array);
    }

    public static void rellenarArray(int[] array) {
        int indice = 0;
        int inicio = 0;
        int numero = 0;

        do {
            numero = solicitarNumero("Ingrese el numero a rellenar: ");
            do {
                indice = solicitarNumero("Ingrese el indice hasta el cual deseas rellenar el array (inicio: " + inicio + " final: " + array.length + "):");
            } while (indice < inicio || indice >= array.length);
            
            for (int i = inicio; i <= indice; i++) {
                array[i] = numero;
            }   
            inicio = indice + 1;
        } while (inicio < array.length);

        System.out.println("Array rellenado correctamente.");
        imprimirArray(array);
        sc.close();
    }

    public static int solicitarNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                do{
                    System.out.print(mensaje);
                    numero = sc.nextInt();

                    if (numero <= 0) {
                        System.out.println("Error: El numero debe ser mayor a 0.");
                    }
                } while (numero <= 0);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero.");
                error = true;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);

        return numero;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| " + array[i] + " |");
        }
    }
}
