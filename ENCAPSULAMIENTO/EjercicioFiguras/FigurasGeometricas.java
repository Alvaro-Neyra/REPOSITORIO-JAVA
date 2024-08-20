package EjercicioFiguras;
import java.util.InputMismatchException;
import java.util.Scanner;

import EjercicioFiguras.modelos.FiguraCirculo;
import EjercicioFiguras.modelos.FiguraRectangulo;
import EjercicioFiguras.modelos.FiguraTriangulo;
import EjercicioFiguras.modelos.Rectangulo;

public class FigurasGeometricas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int opcion;
        do {
            menu();
            opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    FiguraRectangulo.main(null);
                    break;
                case 2:
                    FiguraTriangulo.main(null);
                    break;
                case 3: 
                    FiguraCirculo.main(null);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opcion != 4);
    }

    public static void menu() {
        System.out.println("1. Crear Rectángulo");
        System.out.println("2. Crear Triángulo");
        System.out.println("3. Crear Círculo");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
    }

    public static int obtenerOpcion() {
        int opcion = 0;
        boolean error = false;
        do {
            error = false;
            try {
                do {

                    System.out.print("Ingrese la opcion: ");
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 7);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return opcion;
    }
}
