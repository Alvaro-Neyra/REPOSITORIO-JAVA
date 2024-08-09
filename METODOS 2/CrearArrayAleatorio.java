import java.util.InputMismatchException;
import java.util.Scanner;

public class CrearArrayAleatorio {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int longitud = solicitarNumero("Ingrese la longitud del array: ");
        int min = solicitarNumero("Ingrese el valor minimo: ");
        int max = solicitarNumero("Ingrese el valor maximo: ");
        int[] array = crearArrayAleatorio(longitud, min, max);
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

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] crearArrayAleatorio(int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(min, max);
        }
        return array;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| " + array[i] + " | ");
        }
        System.out.println();
    }
}
