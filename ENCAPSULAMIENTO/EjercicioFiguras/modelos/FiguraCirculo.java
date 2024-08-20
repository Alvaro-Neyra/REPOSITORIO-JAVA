package EjercicioFiguras.modelos;
import java.util.InputMismatchException;
import java.util.Scanner;

import EjercicioFiguras.modelos.Circulo;
import EjercicioFiguras.modelos.FiguraRectangulo;

public class FiguraCirculo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }
    
    public static void iniciar() {
        Circulo circulo = null;
        int opcion;
        do {
            menuInteractivo();
            opcion = FiguraRectangulo.obtenerOpcion();
            switch (opcion) {
                case 1:
                    circulo = crearCirculo();
                    break;
                case 2:
                    if (circulo != null) {
                        System.out.println("Radio: " + circulo.getRadio());
                    } else {
                        System.out.println("No se ha creado un círculo");
                    }
                    break;
                case 3:
                    if (circulo != null) {
                        System.out.println("Área: " + circulo.area());
                    } else {
                        System.out.println("No se ha creado un círculo");
                    }
                    break;
                case 4:
                    if (circulo != null) {
                        System.out.println("Perímetro: " + circulo.perimetro());
                    } else {
                        System.out.println("No se ha creado un círculo");
                    }
                    break;
                case 5:
                    circulo = null;
                    System.out.println("Circulo eliminado");
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opcion != 6);
    }

    public static void menuInteractivo() {
        System.out.println("1. Crear Círculo");
        System.out.println("2. Mostrar radio");
        System.out.println("3. Mostrar área");
        System.out.println("4. Mostrar perímetro");
        System.out.println("5. Eliminar círculo");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
    }

    public static Circulo crearCirculo() {
        double radio = 0;
        boolean error = false;
        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese el radio: ");
                    radio = sc.nextDouble();
                    if (radio <= 0) {
                        System.out.println("El radio debe ser mayor a 0");
                    }
                } while (radio <= 0);
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
        return new Circulo(radio);
    }
}
