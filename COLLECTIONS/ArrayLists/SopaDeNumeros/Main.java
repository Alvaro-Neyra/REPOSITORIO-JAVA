import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = leerValores(list);
        int sum = calcularSuma(list);
        double average = calcularPromedio(list);
        mostrarResultados(list, sum, average);
    }

    public static ArrayList<Integer> leerValores(ArrayList<Integer> list) {
        int valor = 0;
        System.out.println("Ingrese una serie de valores enteros a la lista: ");
        do {
            valor = pedirNumero();
            if (valor != -99) {
                list.add(valor);
            }
        } while (valor != -99);
        return list;
    }

    public static int calcularSuma(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int suma = 0;
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }

    public static int calcularPromedio(ArrayList<Integer> list) {
        return calcularSuma(list) / list.size();
    }

    private static void mostrarResultados(ArrayList<Integer> numbers, int sum, double average) {
        System.out.println("Total de valores: " + numbers.size());
        System.out.println("Suma: " + sum);
        System.out.println("Promedio: " + average);
        int countAboveAverage = 0;
        for (int num : numbers) {
            if (num > average) {
                countAboveAverage++;
            }
        }
        System.out.println("Valores por encima del promedio: " + countAboveAverage);
        
    }

    public static int pedirNumero() {
        boolean error = false;
        int numero = 0;
        do {
            try {
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }
}