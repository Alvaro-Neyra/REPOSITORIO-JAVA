import java.util.Scanner;
import java.util.InputMismatchException;

class Rectangulo {

    private double ancho;
    private double alto;
    private static int contadorTriangulos;

    public Rectangulo() {
        contadorTriangulos++;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorTriangulos++;
    }

    public void contadorDeRectangulos() {
        System.out.println("Se han creado " + contadorTriangulos + " rectángulos.");
    }

    public void imprimirArea() {
        System.out.println("El área del rectángulo es: " + (ancho * alto));
    }

    public void imprimirPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + (2 * ancho + 2 * alto));
    }

    public static int getContadorRectangulos() {
        return contadorTriangulos;
    }

    // Getters
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    // Setters
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}

public class FiguraGeometrica {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        Rectangulo rectangulo = null; // Inicialmente, no hay ningún rectángulo creado
        int opcion = 0;
        do {
            menu1();
            opcion = pedirOpcion();
            if (opcion == 1) {
                double anchoRectangulo = pedirDouble("Ingrese el ancho del rectángulo: ");
                double altoRectangulo = pedirDouble("Ingrese el alto del rectángulo: ");
                rectangulo = new Rectangulo(anchoRectangulo, altoRectangulo);
            } else {
                if (rectangulo == null) {
                    System.out.println("Primero debe crear un rectángulo.");
                } else {
                    switch (opcion) {
                        case 2:
                            double ancho = pedirDouble("Ingrese el ancho del rectángulo: ");
                            rectangulo.setAncho(ancho);
                            break;
                        case 3:
                            double alto = pedirDouble("Ingrese el alto del rectángulo: ");
                            rectangulo.setAlto(alto);
                            break;
                        case 4:
                            rectangulo.imprimirArea();
                            break;
                        case 5:
                            rectangulo.imprimirPerimetro();
                            break;
                        case 6:
                            int contadorDeRectangulos = Rectangulo.getContadorRectangulos();
                            System.out.println("Se han creado " + contadorDeRectangulos + " rectángulos.");
                            break;
                        case 7:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                }
            }
        } while (opcion != 7);
    }

    public static void menu1() {
        System.out.println("Menú:");
        System.out.println("1. Crear un nuevo rectangulo");
        System.out.println("2. Especificar ancho");
        System.out.println("3. Especificar alto");
        System.out.println("4. Imprimir área");
        System.out.println("5. Imprimir perímetro");
        System.out.println("6. Imprimir cantidad de rectángulos");
        System.out.println("7. Salir");
    }

    public static int pedirOpcion() {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.print("Ingrese una opción: ");
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
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

    public static double pedirDouble(String mensaje) {
        boolean error = false;
        double numero = 0;
        do {
            error = false;
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número.");
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
            }
        } while (error);
        return numero;
    }
}
