import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double nota = solicitarNota();
        transformarNota(nota);
        sc.close();
    }

    public static double solicitarNota() {
        double nota = 0;
        boolean error = false;
        
        do {
            error = false;
            try {
                do {
                    System.out.print("Introduce una nota: ");
                    nota = sc.nextDouble();

                    if (nota < 0 || nota > 100) {
                        System.out.println("Error: La nota debe estar en el intervalo (0 - 100).");
                    }

                } while (nota < 0 || nota > 100);
            } catch (InputMismatchException e) {
                System.out.println("Error: No has introducido un número.");
                error = true;
                sc.nextLine(); /* Limpiar el scanner */
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);

        return nota;
    }

    public static void transformarNota(double nota) {
        if (nota < 0 || nota > 100) {
            System.out.println("El valor ingresado está fuera del intervalo (0 - 100)");
        } else if (nota < 60) {
            System.out.println("La nota obtenida es: F");
        } else if (nota <= 69) {
            System.out.println("La nota obtenida es: D");
        } else if (nota <= 79) {
            System.out.println("La nota obtenida es: C");
        } else if (nota <= 89) {
            System.out.println("La nota obtenida es: B");
        } else {
            System.out.println("La nota obtenida es: A");
        }
    }
}