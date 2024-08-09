import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        sc.close();
    }

    public static void menu() {
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        int opcion = 0;
        boolean error = false;
        do {
            mostrarMenu();
            do {
                error = false;
                try {
                    do {
                        System.out.print("Introduce una opción: ");
                        opcion = sc.nextInt();

                        if (opcion < 1 || opcion > 5) {
                            System.out.println("Error: Opción no válida.");
                        }
                    } while (opcion < 1 || opcion > 5);
                } catch (InputMismatchException e) {
                    System.out.println("Error: No has introducido un número entero.");
                    sc.nextLine(); /* Limpiar el scanner */
                    error = true;
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine();
                    error = true;
                }
            } while (error);

            if (opcion != 5) {
                numero1 = solicitarNumero();
                numero2 = solicitarNumero();
            }

            switch (opcion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(numero1, numero2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        double resultadoDiv = dividir(numero1, numero2);
                        System.out.println("El resultado de la división es: " + resultadoDiv);
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);   
    }

    public static void mostrarMenu() {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }

    public static int solicitarNumero() {
        int numero = 0;
        boolean error = false;
        
        do {
            error = false;
            try {
                System.out.print("Introduce un número entero: ");
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: No has introducido un número entero.");
                error = true;
                sc.nextLine(); /* Limpiar el scanner */
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);

        return numero;
    }
}
