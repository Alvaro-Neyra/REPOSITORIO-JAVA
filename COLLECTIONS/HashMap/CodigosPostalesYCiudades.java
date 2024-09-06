import java.util.HashMap;
import java.util.Scanner;

public class CodigosPostalesYCiudades {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> codigosPostales = new HashMap<String, String>();

        codigosPostales.put("8600", "Silkeborg");
        codigosPostales.put("8700", "Horsens");
        codigosPostales.put("8800", "Viborg");
        codigosPostales.put("8900", "Randers");

        int opcion = 0;
        do {
            menu();
            opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    mostrarCiudades(codigosPostales);
                    break;
                case 2:
                    ingresarCiudad(codigosPostales);
                    break;
                case 3:
                    buscarCiudad(codigosPostales);
                    break;
                case 4:
                    eliminar3Ciudades(codigosPostales);
                    break;
                case 5:
                    actualizarCiudad(codigosPostales);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 6);
    }

    public static void menu() {
        System.out.println("1. Mostrar todas las ciudades");
        System.out.println("2. Ingresar nueva ciudad");
        System.out.println("3. Buscar ciudad por código postal");
        System.out.println("4. Eliminar 3 ciudades existentes");
        System.out.println("5. Actualizar ciudad");
        System.out.println("6. Salir");
    }

    public static void mostrarCiudades(HashMap<String, String> codigosPostales) {
        for (String ciudad : codigosPostales.keySet()) {
            System.out.println("Codigo Postal: " + ciudad + " - Ciudad: " + codigosPostales.get(ciudad));
        }
    }

    public static void ingresarCiudad(HashMap<String, String> codigosPostales) {
        System.out.println("Ingrese el codigo postal: ");
        String codigoPostal = sc.nextLine();
        boolean existeCodigoPostal = codigosPostales.containsKey(codigoPostal);
        if (existeCodigoPostal) {
            System.out.println("El codigo postal ya existe");
        } else {
            System.out.println("Ingrese el nombre de la ciudad: ");
            String ciudad = sc.nextLine();
            codigosPostales.put(codigoPostal, ciudad);
            System.out.println("Ciudad ingresada correctamente");
        }
    }

    public static void buscarCiudad(HashMap<String, String> codigosPostales) {
        System.out.println("Ingrese el codigo postal: ");
        String codigoPostal = sc.nextLine();
        boolean existeCodigoPostal = codigosPostales.containsKey(codigoPostal);
        if (existeCodigoPostal) {
            System.out.println("Ciudad: " + codigosPostales.get(codigoPostal));
        } else {
            System.out.println("El codigo postal no existe");
        }
    }

    public static void eliminar3Ciudades(HashMap<String, String> codigosPostales) {
        boolean existeCiudad = false;

        if (codigosPostales.size() < 3) {
            System.out.println("No hay suficientes ciudades para eliminar (minimo 3 ciudades)");
            return;
        }

        for (int i = 0 ; i < 3; i++) {
            do {
                System.out.println("Ingrese el codigo postal de la ciudad: ");
                String codigoPostal = sc.nextLine();
                if (codigosPostales.containsKey(codigoPostal)) {
                    codigosPostales.remove(codigoPostal);
                    existeCiudad = false;
                    System.out.println("Ciudad eliminada correctamente");
                } else {
                    System.out.println("La ciudad no existe, intentelo de nuevo");
                    existeCiudad = true;
                }
            } while (existeCiudad);
        }

        System.out.println("3 ciudades eliminadas correctamente!!");
    }

    public static void actualizarCiudad(HashMap<String, String> codigosPostales) {
        System.out.println("Ingrese el codigo postal de la ciudad a actualizar: ");
        String codigoPostal = sc.nextLine();
        boolean existeCodigoPostal = codigosPostales.containsKey(codigoPostal);
        if (existeCodigoPostal) {
            System.out.println("Ingrese el nuevo nombre de la ciudad: ");
            String ciudad = sc.nextLine();
            codigosPostales.put(codigoPostal, ciudad);
            System.out.println("Ciudad actualizada correctamente");
        } else {
            System.out.println("El codigo postal no existe");
        }
    }

    public static int obtenerNumero(String mensaje) {
        int numero = 0;
        boolean esNumero = false;
        do {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                esNumero = true;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número valido");
                esNumero = false;
                sc.nextLine();
            } catch (Exception e ) {
                System.out.println("Error: " + e.getMessage());
                esNumero = false;
                sc.nextLine();
            }
        } while (!esNumero);
        return numero;
    }

    public static int obtenerOpcion() {
        int opcion = 0;
        do {
            opcion = obtenerNumero("Ingrese una opción: ");
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no valida, intentelo de nuevo");
            }
        } while (opcion < 1 || opcion > 6);
        return opcion;
    }
}