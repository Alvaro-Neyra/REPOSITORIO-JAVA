import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ManipularOraciones {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        String oracion = "";
        int opcion = 0;
        do {
            mostrarOracion(oracion);
            mostrarMenu(oracion);
            opcion = pedirOpcion();
            if (opcion == 1) {
                sc.nextLine();
                oracion = pedirOracion();
            } else if (oracionExiste(oracion)) {
                sc.nextLine();
                switch (opcion) {
                    case 2:
                        System.out.println("La oración tiene " + contarLetras(oracion) + " caracteres");
                        break;
                    case 3:
                        System.out.println("La oración tiene " + contarPalabras(oracion) + " palabras");
                        break;
                    case 4:
                        ordenarPalabras(oracion);
                        break;
                    case 5:
                        palabraPorNumero(oracion);
                        break;
                    case 6:
                        buscarPalabra(oracion);
                        break;
                    case 7:
                        oracion = reemplazarPalabra(oracion);
                        break;
                    case 8:
                        oracion = agregarContenido(oracion);
                        break;
                    case 9:
                        salir();
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente");
                        break;
                }
            } else {
                System.out.println("No hay oración para manipular");
            }
        } while (opcion != 9);

        sc.close();
    }

    public static void mostrarMenu(String oracion) {
        if (oracion.equals("")) {
            System.out.println("1. Introducir oración");
        } else {
            System.out.println("1. Borrar oración");
        }
        System.out.println("2. Cantidad de caracteres");
        System.out.println("3. Cantidad de palabras");
        System.out.println("4. Mostrar las palabras ordenadas alfabéticamente");
        System.out.println("5. Mostrar una palabra por número");
        System.out.println("6. Buscar una palabra");
        System.out.println("7. Reemplazar una palabra");
        System.out.println("8. Agregar contenido");
        System.out.println("9. Salir");
    }

    public static int pedirOpcion() {
        int opcion = 0;
        boolean error = false;

        do {
            error = false;
            try {
                System.out.print("Introduce una opción: ");
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 9) {
                    System.out.println("Opción inválida. Intente nuevamente");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir la opción");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error al introducir la opción");
                sc.nextLine();
                error = true;
            }
        } while (error || opcion < 1 || opcion > 9);

        return opcion;
    }

    public static String pedirOracion() {
        String oracion = "";
        boolean error = false;

        do {
            error = false;
            try {
                System.out.print("Introduce una oración: ");
                oracion = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error al introducir la oración");
                error = true;
            }
        } while (error);

        return oracion;
    }

    public static int contarPalabras(String oracion) {
        int palabras = 0;
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == ' ') {
                palabras++;
            }
        }
        return palabras + 1;
    }

    public static int contarLetras(String oracion) {
        return oracion.length();
    }

    public static void ordenarPalabras(String oracion) {
        String[] palabras = oracion.split(" ");
        Arrays.sort(palabras);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + " ");
        }
        System.out.println();
    }

    public static void palabraPorNumero(String oracion) {
        int numero = 0;
        boolean error = false;

        do {
            error = false;
            try {
                System.out.print("Introduce un número: ");
                numero = sc.nextInt();
                if (numero < 1 || numero > contarPalabras(oracion)) {
                    System.out.println("Número inválido. Intente nuevamente");
                }
            } catch (Exception e) {
                System.out.println("Error al introducir el número");
                error = true;
            }
        } while (error || numero < 1 || numero > contarPalabras(oracion));

        String[] palabras = oracion.split(" ");
        System.out.println(palabras[numero - 1]);
    }

    public static void buscarPalabra(String oracion) {
        String palabra = "";
        boolean error = false;

        do {
            error = false;
            try {
                System.out.print("Introduce una palabra: ");
                palabra = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error al introducir la palabra");
                error = true;
            }
        } while (error);

        if (oracion.contains(palabra)) {
            System.out.println("La palabra " + palabra + " está en la oración");
        } else {
            System.out.println("La palabra " + palabra + " no está en la oración");
        }
    }

    public static String reemplazarPalabra(String oracion) {
        String palabra = "";
        String reemplazo = "";
        boolean error = false;
        do {
            error = false;
            try {
                System.out.print("Introduce una palabra que este en la oracion: ");
                palabra = sc.nextLine();
                if (!oracion.contains(palabra)) {
                    System.out.println("La palabra no está en la oración");
                    error = true;
                }
            } catch (Exception e) {
                System.out.println("Error al introducir la palabra");
                error = true;
            }
        } while (error);

        do {
            error = false;
            try {
                System.out.print("Introduce la palabra de reemplazo: ");
                reemplazo = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error al introducir la palabra de reemplazo");
                error = true;
            }
        } while (error);

        return oracion.replace(palabra, reemplazo);
    }

    public static String agregarContenido(String oracion) {
        String contenido = "";
        boolean error = false;

        do {
            error = false;
            try {
                System.out.print("Introduce el contenido a agregar: ");
                contenido = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error al introducir el contenido");
                error = true;
            }
        } while (error);

        return oracion + contenido;
    }

    public static String borrarContenido(String oracion) {
        return "";
    }

    public static boolean oracionExiste(String oracion) {
        return !oracion.equals("");
    }

    public static void mostrarOracion(String oracion) {
        System.out.println(oracion);
    }

    public static void salir() {
        System.out.println("Hasta luego");
    }
}
