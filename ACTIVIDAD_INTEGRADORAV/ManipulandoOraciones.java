import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class ManipulandoOraciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oracion = "";
        int opcion = 0;

        do {
            System.out.println("Oración actual: " + oracion);
            mostrarMenu();
            opcion = leerOpcion(sc);
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    if (oracion.isEmpty()) {
                        oracion = crearOracion(sc);
                        System.out.println("Oración creada!");
                    } else {
                        oracion = borrarOracion();
                        System.out.println("Oración borrada!");
                    }
                    break;
                case 2:
                    System.out.println("La cantidad de caracteres de la oración es: " + cantidadCaracteres(oracion));
                    break;
                case 3:
                    System.out.println("La cantidad de palabras de la oración es: " + cantidadPalabras(oracion));
                    break;
                case 4:
                    String[] palabras = ordenarPalabras(oracion);
                    System.out.println("Palabras ordenadas: " + String.join(" ", palabras));
                    break;
                case 5:
                    verificarPosicion(sc, oracion);
                    break;
                case 6:
                    sc.nextLine();
                    pedirPalabra(sc, oracion);
                    break;
                case 7:
                    sc.nextLine();
                    oracion = modificarPalabra(sc, oracion);
                    break;
                case 8:
                    sc.nextLine();
                    oracion = agregarContenido(sc, oracion);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 9);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("1. Crear oración o Borrar oración");
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar las palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y mostrar la palabra que se encuentra en esa posición");
        System.out.println("6. Buscar la palabra dentro de la oración");
        System.out.println("7. Modificar la palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración (al final)");
        System.out.println("9. Salir");
    }

    public static int leerOpcion(Scanner sc) {
        int opcion = 0;
        boolean error = true;
        do {
            try {
                System.out.print("Ingrese una opción: ");
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 9) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
                }
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (error);

        return opcion;
    }

    public static String crearOracion(Scanner sc) {
        System.out.print("Ingrese la oración: ");
        return sc.nextLine();
    }

    public static String borrarOracion() {
        return "";
    }

    public static int cantidadCaracteres(String oracion) {
        return oracion.length();
    }

    public static int cantidadPalabras(String oracion) {
        return oracion.trim().split("\\s+").length;
    }

    public static String[] ordenarPalabras(String oracion) {
        String[] palabras = oracion.trim().split("\\s+");
        Arrays.sort(palabras);
        return palabras;
    }

    public static String palabraEnPosicion(String oracion, int posicion) {
        String[] palabras = oracion.trim().split("\\s+");
        if (posicion >= 0 && posicion < palabras.length) {
            return "La palabra en la posición " + posicion + " es: " + palabras[posicion];
        }
        return "No existe palabra en la posición " + posicion;
    }

    public static void verificarPosicion(Scanner sc, String oracion) {
        int posicion = 0;
        boolean error = true;
        do {
            try {
                System.out.print("Ingrese la posición de la palabra: ");
                posicion = sc.nextInt();
                if (posicion < 0) {
                    System.out.println("La posición debe ser un número no negativo.");
                    continue;
                }
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (error);

        System.out.println(palabraEnPosicion(oracion, posicion));
    }

    public static String buscarPalabra(String oracion, String palabra) {
        String[] palabras = oracion.trim().split("\\s+");
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                return "La palabra " + palabra + " se encuentra en la oración.";
            }
        }
        return "La palabra " + palabra + " no se encuentra en la oración.";
    }

    public static void pedirPalabra(Scanner sc, String oracion) {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = sc.nextLine();
        System.out.println(buscarPalabra(oracion, palabra));
    }

    public static String modificarPalabra(Scanner sc, String oracion) {
        String[] palabras = oracion.trim().split("\\s+");
        String palabra = "";
        boolean noEncontrado = true;

        do {
            System.out.print("Ingrese la palabra a modificar: ");
            palabra = sc.nextLine();
            noEncontrado = true;

            for (String p : palabras) {
                if (p.equalsIgnoreCase(palabra)) {
                    System.out.println("La palabra se encuentra en la oración.");
                    noEncontrado = false;
                    break;
                }
            }

            if (noEncontrado) {
                System.out.println("La palabra no se encuentra en la oración. Intente nuevamente.");
            }

        } while (noEncontrado);

        System.out.print("Ingrese la nueva palabra: ");
        String nuevaPalabra = sc.nextLine();
        oracion = oracion.replaceFirst("\\b" + palabra + "\\b", nuevaPalabra);

        System.out.println("Oración modificada: " + oracion);
        return oracion;
    }

    public static String agregarContenido(Scanner sc, String oracion) {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = sc.nextLine();
        oracion += " " + contenido;
        System.out.println("Oración modificada: " + oracion);
        return oracion;
    }
}
