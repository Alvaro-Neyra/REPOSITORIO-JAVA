import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int numeroAleatorio = generarNumeroAleatorio(1, 20);
            int numeroAdivinado = 0;
            do {
                System.out.print("Introduce un numero entre 1 y 20, para adivinar el numero generado: ");
                numeroAdivinado = sc.nextInt();
                if (numeroAdivinado < numeroAleatorio) {
                    System.out.println("El numero introducido es menor que el numero a adivinar.");
                } else if (numeroAdivinado > numeroAleatorio) {
                    System.out.println("El numero introducido es mayor que el numero a adivinar.");
                } else {
                    break;
                }
            } while (numeroAdivinado != numeroAleatorio);
            
            if (numeroAdivinado == numeroAleatorio) {
                System.out.println("¡Enhorabuena! Has adivinado el numero.");
            }
            
            sc.close();
        } catch(InputMismatchException e) {
            System.out.println("Error: Debe introducir un numero entero.");
            main(args);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
