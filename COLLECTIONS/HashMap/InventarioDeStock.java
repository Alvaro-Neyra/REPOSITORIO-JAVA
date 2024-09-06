import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;

public class InventarioDeStock {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<String, Integer>();
        inventario.put("Papas", 100);
        inventario.put("Manzanas", 200);
        inventario.put("Peras", 300);
        inventario.put("Naranjas", 400);
        int opcion = 0;
        do {
            menu();
            opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    mostrarInventario(inventario);
                    break;
                case 2:
                    ingresarProducto(inventario);
                    break;
                case 3:
                    buscarProducto(inventario);
                    break;
                case 4:
                    actualizarCantidad(inventario);
                    break;
                case 5:
                    cantidadProducto(inventario);
                    break;
                case 6:
                    verificarExistencia(inventario);
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 7);
    }

    public static void mostrarInventario(HashMap<String, Integer> inventario) {
        for (String producto : inventario.keySet()) {
            System.out.println("Producto: " + producto + " - Cantidad: " + inventario.get(producto));
        }
    }

    public static void ingresarProducto(HashMap<String, Integer> inventario) {
        String producto = obtenerCadena("Ingrese el nombre del producto: ");
        if (inventario.containsKey(producto)) {
            System.out.println("Error: El producto ya existe");
        } else {
            int cantidad = obtenerNumero("Ingrese la cantidad del producto: ");
            inventario.put(producto, cantidad);
            System.out.println("Producto ingresado correctamente");
        }
    }

    public static void buscarProducto(HashMap<String, Integer> inventario) {
        String producto = obtenerCadena("Ingrese el nombre del producto: ");
        boolean existeProducto = inventario.containsKey(producto);
        if (existeProducto) {
            System.out.println("Cantidad: " + inventario.get(producto));
        } else {
            System.out.println("El producto no existe");
        }
    }

    public static void actualizarCantidad(HashMap<String, Integer> inventario) {
        String producto = obtenerCadena("Ingrese el nombre del producto: ");
        boolean existeProducto = inventario.containsKey(producto);
        if (existeProducto) {
            int cantidad = obtenerNumero("Ingrese la nueva cantidad del producto: ");
            inventario.put(producto, cantidad);
            System.out.println("Cantidad actualizada correctamente");
        } else {
            System.out.println("El producto no existe");
        }
    }

    public static void cantidadProducto(HashMap<String, Integer> inventario) {
        String producto = obtenerCadena("Ingrese el nombre del producto: ");
        boolean existeProducto = inventario.containsKey(producto);
        if (existeProducto) {
            System.out.println("Cantidad: " + inventario.get(producto));
        } else {
            System.out.println("El producto no existe");
        }
    }

    public static void verificarExistencia(HashMap<String, Integer> inventario) {
        String producto = obtenerCadena("Ingrese el nombre del producto: ");
        boolean existeProducto = inventario.containsKey(producto);
        if (existeProducto) {
            System.out.println("El producto existe");
        } else {
            System.out.println("El producto no existe");
        }
    }

    public static int obtenerOpcion() {
        int opcion = 0;
        do {
            opcion = obtenerNumero("Ingrese una opción: ");
            if (opcion < 1 || opcion > 7) {
                System.out.println("Error: Opción no valida");
            }
        } while (opcion < 1 || opcion > 7);
        return opcion;
    }

    public static void menu() {
        System.out.println("1. Mostrar inventario");
        System.out.println("2. Ingresar nuevo producto");
        System.out.println("3. Buscar producto por nombre");
        System.out.println("4. Actualizar cantidad de un producto");
        System.out.println("5. Cantidad de un producto");
        System.out.println("6. Verificar la existencia de un producto");
        System.out.println("7. Salir");
    }

    public static int obtenerNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    public static String obtenerCadena(String mensaje) {
        boolean error = false;
        String cadena = "";
        do {
            try {
                System.out.print(mensaje);
                sc.nextLine();
                cadena = sc.nextLine();
                error = false;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                error = true;
            }
        } while (error);
        return cadena;
    }
}
