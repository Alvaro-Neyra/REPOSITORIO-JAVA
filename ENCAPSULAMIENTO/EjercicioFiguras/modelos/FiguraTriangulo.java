package EjercicioFiguras.modelos;
import java.util.InputMismatchException;
import java.util.Scanner;

import EjercicioFiguras.modelos.FiguraRectangulo;
import EjercicioFiguras.modelos.Triangulo;

public class FiguraTriangulo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        Triangulo triangulo = null;
        int opcion;
        do {
            menuInteractivo();
            opcion = FiguraRectangulo.obtenerOpcion();
            switch (opcion) {
                case 1:
                    triangulo = crearTriangulo();
                    break;
                case 2:
                    if (triangulo != null) {
                        System.out.println("Base: " + triangulo.getBase());
                        System.out.println("Altura: " + triangulo.getAltura());
                    } else {
                        System.out.println("No se ha creado un triángulo");
                    }
                    break;
                case 3:
                    if (triangulo != null) {
                        System.out.println("Área: " + triangulo.area());
                    } else {
                        System.out.println("No se ha creado un triángulo");
                    }
                    break;
                case 4:
                    if (triangulo != null) {
                        System.out.println("Perímetro: " + triangulo.perimetro());
                    } else {
                        System.out.println("No se ha creado un triángulo");
                    }
                    break;
                case 5:
                    triangulo = null;
                    System.out.println("Triángulo eliminado");
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opcion != 6);
    }

    public static Triangulo crearTriangulo() {
        double base = 0;
        double altura = 0;
        boolean error = false;
        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese la base: ");
                    base = sc.nextDouble();
                } while (base <= 0);
                do {
                    System.out.print("Ingrese la altura: ");
                    altura = sc.nextDouble();
                } while (altura <= 0);
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return new Triangulo(base, altura);
    }

    public static void menuInteractivo() {
        System.out.println("1. Crear Triángulo");
        System.out.println("2. Mostrar base y altura");
        System.out.println("3. Mostrar área");
        System.out.println("4. Mostrar perímetro");
        System.out.println("5. Eliminar triángulo");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
    }
}
