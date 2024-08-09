import java.util.Scanner;
import java.util.InputMismatchException;

public class ImprimirArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int tamanio = 0;
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
                            System.out.println("Error: La opción debe estar en el intervalo (1 - 5).");
                        }
                    } while (opcion < 1 || opcion > 5);
                } catch (InputMismatchException e) {
                    System.out.println("Error: No has introducido un número.");
                    sc.nextLine();
                    error = true;
                } catch(Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine();
                    error = true;
                }
            } while (error);

            if (opcion != 5) {
                tamanio = solicitarEntero("Introduce el tamaño del array: ");
            }
    
            switch (opcion) {
                case 1:
                    int[] arrayEnteros = generarArrayEnteros(tamanio);
                    imprimirArray(arrayEnteros);
                    break;
                case 2:
                    String[] arrayCadenas = generarArrayCadenas(tamanio);
                    imprimirArray(arrayCadenas);
                    break;
                case 3:
                    int[][] arrayEnterosBidimensional = generarArrayEnterosBidimensional(tamanio);
                    imprimirArray(arrayEnterosBidimensional);
                    break;
                case 4:
                    String[][] arrayCadenasBidimensional = generarArrayCadenasBidimensional(tamanio);
                    imprimirArray(arrayCadenasBidimensional);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("| " + array[i] + " | ");
        }
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("| " + array[i] + " | ");
        }
    }

    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static void imprimirArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static void mostrarMenu() {
        System.out.println("1. Imprimir array de enteros");
        System.out.println("2. Imprimir array de cadenas");
        System.out.println("3. Imprimir array de enteros bidimensional");
        System.out.println("4. Imprimir array de cadenas bidimensional");
        System.out.println("5. Salir");
    }
    
    public static int solicitarEntero(String mensaje) {
        int numero = 0;
        boolean error = false;
        do {
            error = false;
            try {
                do {
                    System.out.print(mensaje);
                    numero = sc.nextInt();
                } while (numero < 0);
            } catch (InputMismatchException e) {
                System.out.println("Error: No has introducido un número.");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    public static String generarCadena() {
        int tamanoDeLaCadena = numeroAleatorio(1, 10);
        String cadena = "";
        for (int i = 0; i < tamanoDeLaCadena; i++) {
            char caracter = (char) numeroAleatorio(97, 122);
            cadena += caracter;
        }
        return cadena;
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] generarArrayEnteros(int tamano) {
        int[] array = new int[tamano];
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(1, 100);
        }
        return array;
    }

    public static String[] generarArrayCadenas(int tamano) {
        String[] array = new String[tamano];
        for (int i = 0; i < array.length; i++) {
            array[i] = generarCadena();
        }
        return array;
    }

    public static int[][] generarArrayEnterosBidimensional(int tamano) {
        int[][] array = new int[tamano][tamano];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = numeroAleatorio(1, 100);
            }
        }
        return array;
    }

    public static String[][] generarArrayCadenasBidimensional(int tamano) {
        String[][] array = new String[tamano][tamano];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = generarCadena();
            }
        }
        return array;
    }
}
