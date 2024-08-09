import java.util.Scanner;
import java.util.InputMismatchException;

public class FigurasGeometricas {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int opcion = 0;

        System.out.println("Bienvenido al programa de calculo de figuras geometricas");
        System.out.println("A continuacion seleccione una figura y un calculo a realizar");

        do {
            realizarCalculo();
            System.out.println("Deseas realizar otro calculo? (1. Si / 2. No)");
            opcion = solicitarOpcion("Seleccione una opcion: ", 1, 2);
        } while (opcion != 2);

        System.out.println("Gracias por utilizar el programa de calculo de figuras geometricas");
        sc.close();
    }

    public static void realizarCalculo() {
        int opcionFigura = 0;
        int opcionCalculo = 0;
        do {
            mostrarMenuFiguras();
            opcionFigura = solicitarOpcion("Seleccione una figura: ", 1, 5);

            switch (opcionFigura) {
                case 1:
                    do {
                        mostrarMenuCalculos();
                        opcionCalculo = solicitarOpcion("Seleccione un calculo: ", 1, 2);

                        switch (opcionCalculo) {
                            case 1:
                                calcularAreaCuadrado();
                                break;
                            case 2:
                                calcularPerimetroCuadrado();
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (opcionCalculo != 1 && opcionCalculo != 2);
                    break;
                case 2:
                    do {
                        mostrarMenuCalculos();
                        opcionCalculo = solicitarOpcion("Seleccione un calculo: ", 1, 2);

                        switch (opcionCalculo) {
                            case 1:
                                calcularAreaRectangulo();
                                break;
                            case 2:
                                calcularPerimetroRectangulo();
                                break;
                        }
                    } while (opcionCalculo != 1 && opcionCalculo != 2);
                    break;
                case 3:
                    do {
                        mostrarMenuCalculos();
                        opcionCalculo = solicitarOpcion("Seleccione un calculo: ", 1, 2);

                        switch (opcionCalculo) {
                            case 1:
                                calcularAreaTriangulo();
                                break;
                            case 2:
                                calcularPerimetroTriangulo();
                                break;
                        }
                    } while (opcionCalculo != 1 && opcionCalculo != 2);
                    break;
                case 4:
                    do {
                        mostrarMenuCalculos();
                        opcionCalculo = solicitarOpcion("Seleccione un calculo: ", 1, 2);

                        switch (opcionCalculo) {
                            case 1:
                                calcularAreaCirculo();
                                break;
                            case 2:
                                calcularPerimetroCirculo();
                                break;
                        }
                    } while (opcionCalculo != 1 && opcionCalculo != 2);
                    break;
                case 5:
                    do {
                        mostrarMenuCalculos();
                        opcionCalculo = solicitarOpcion("Seleccione un calculo: ", 1, 2);

                        switch (opcionCalculo) {
                            case 1:
                                calcularAreaParalelogramo();
                                break;
                            case 2:
                                calcularPerimetroParalelogramo();
                                break;
                        }
                    } while (opcionCalculo != 1 && opcionCalculo != 2);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionFigura != 1 && opcionFigura != 2 && opcionFigura != 3 && opcionFigura != 4 && opcionFigura != 5);
    }

    public static void mostrarMenuFiguras() {
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("5. Paralelogramo");
    }

    public static void mostrarMenuCalculos() {
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular perimetro");
    }

    public static int solicitarOpcion(String mensaje, int minimaOpcion, int maximaOpcion) {
        boolean error = false;
        int opcion = 0;
        do {
            error = false;
            try {
                do {
                    System.out.print(mensaje);
                    opcion = sc.nextInt();

                    if (opcion < minimaOpcion || opcion > maximaOpcion) {
                        System.out.println(
                                "Error: La opcion debe estar entre " + minimaOpcion + " y " + maximaOpcion + ".");
                    }
                } while (opcion < minimaOpcion || opcion > maximaOpcion);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero.");
                error = true;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);

        return opcion;
    }

    public static double solicitarNumero(String mensaje) {
        boolean error = false;
        double numero = 0;
        do {
            error = false;
            try {
                do {
                    System.out.print(mensaje);
                    numero = sc.nextDouble();

                    if (numero <= 0) {
                        System.out.println("Error: El numero debe ser mayor a 0.");
                    }
                } while (numero <= 0);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero.");
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

    public static void calcularAreaCuadrado() {
        double lado = solicitarNumero("Ingrese el lado del cuadrado: ");
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    public static void calcularPerimetroCuadrado() {
        double lado = solicitarNumero("Ingrese el lado del cuadrado: ");
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    public static void calcularAreaRectangulo() {
        double base = solicitarNumero("Ingrese la base del rectangulo: ");
        double altura = solicitarNumero("Ingrese la altura del rectangulo: ");
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }

    public static void calcularPerimetroRectangulo() {
        double base = solicitarNumero("Ingrese la base del rectangulo: ");
        double altura = solicitarNumero("Ingrese la altura del rectangulo: ");
        double perimetro = (base * 2) + (altura * 2);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public static void calcularAreaTriangulo() {
        double base = solicitarNumero("Ingrese la base del triangulo: ");
        double altura = solicitarNumero("Ingrese la altura del triangulo: ");
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public static void calcularPerimetroTriangulo() {
        double lado1 = solicitarNumero("Ingrese el lado 1 del triangulo: ");
        double lado2 = solicitarNumero("Ingrese el lado 2 del triangulo: ");
        double lado3 = solicitarNumero("Ingrese el lado 3 del triangulo: ");
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es: " + perimetro);
    }

    public static void calcularAreaCirculo() {
        double radio = solicitarNumero("Ingrese el radio del circulo: ");
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    public static void calcularPerimetroCirculo() {
        double radio = solicitarNumero("Ingrese el radio del circulo: ");
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    public static void calcularAreaParalelogramo() {
        double base = solicitarNumero("Ingrese la base del paralelogramo: ");
        double altura = solicitarNumero("Ingrese la altura del paralelogramo: ");
        double area = base * altura;
        System.out.println("El area del paralelogramo es: " + area);
    }

    public static void calcularPerimetroParalelogramo() {
        double base = solicitarNumero("Ingrese la base del paralelogramo: ");
        double altura = solicitarNumero("Ingrese la altura del paralelogramo: ");
        double perimetro = (base * 2) + (altura * 2);
        System.out.println("El perimetro del paralelogramo es: " + perimetro);
    }
}
