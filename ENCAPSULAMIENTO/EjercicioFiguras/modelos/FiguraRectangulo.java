package EjercicioFiguras.modelos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FiguraRectangulo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int opcion;
        Rectangulo rectangulo = null;
        do {
            menuInteractivo();
            opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    rectangulo = crearRectangulo();
                    break;
                case 2:
                    if (rectangulo != null) {
                        System.out.println("Ancho: " + rectangulo.getAncho());
                        System.out.println("Alto: " + rectangulo.getAlto());
                    } else {
                        System.out.println("No se ha creado un rectángulo");
                    }
                    break;
                case 3: 
                    if (rectangulo != null) {
                        System.out.println("Area: " + rectangulo.area());
                    } else {
                        System.out.println("No se ha creado un rectángulo");
                    }
                    break;
                case 4:
                    if (rectangulo != null) {
                        System.out.println("Perimetro: " + rectangulo.perimetro());
                    } else {
                        System.out.println("No se ha creado un rectángulo");
                    }
                    break;
                case 5:
                    rectangulo = null;
                    System.out.println("Rectángulo eliminado");
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opcion != 6);
    }

    public static Rectangulo crearRectangulo() {
        double ancho = 0;
        double alto = 0;
        boolean error = false;
        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese el ancho: ");
                    ancho = sc.nextDouble();

                    if (ancho < 0) {
                        System.out.println("El ancho no puede ser negativo");
                    }
                } while (ancho < 0);
                do {
                    System.out.print("Ingrese el alto: ");
                    alto = sc.nextDouble();

                    if (alto < 0) {
                        System.out.println("El alto no puede ser negativo");
                    }
                } while (alto < 0);
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return new Rectangulo(ancho, alto);
    }

    public static void menuInteractivo() {
        System.out.println("1. Crear un Rectángulo");
        System.out.println("2. Acceder a alto y ancho de un Rectángulo");
        System.out.println("3. Obtener el area del Rectángulo");
        System.out.println("4. Obtener el perimetro del Rectángulo");
        System.out.println("5. Eliminar Rectangulo Actual");
        System.out.println("6. Salir");
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
