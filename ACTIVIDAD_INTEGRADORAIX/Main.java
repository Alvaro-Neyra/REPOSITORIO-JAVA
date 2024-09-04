import java.util.InputMismatchException;
import java.util.Scanner;
import modelos.Cliente;
import modelos.Producto;
import modelos.ProductoElectronico;
import modelos.ProductoRopa;
import java.util.ArrayList;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Código de prueba
        int opcion = 0;
        Cliente cliente = new Cliente("Juan");
        do {
            opcion = elegirOpcion();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    int tipoProducto = 0;
                    System.out.println("1. Producto de ropa");
                    System.out.println("2. Producto electrónico");
                    do {
                        tipoProducto = obtenerNumero();
                        if (tipoProducto < 1 || tipoProducto > 2) {
                            System.out.println("Error: Debes ingresar una opción válida");
                        }
                    } while (tipoProducto < 1 || tipoProducto > 2);
                    sc.nextLine();
                    System.out.println("Ingresa el nombre del producto");
                    String nombre = sc.nextLine();
                    System.out.println("Ingresa el precio del producto");
                    int precio = obtenerNumero();
                    System.out.println("Ingresa la cantidad del producto");
                    int cantidad = obtenerNumero();
                    sc.nextLine();
                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = sc.nextLine();
                    if (tipoProducto == 1) {
                        System.out.println("Ingresa la talla del producto");
                        String talla = sc.nextLine();
                        System.out.println("Ingresa el color del producto");
                        String color = sc.nextLine();
                        System.out.println("Ingresa el material del producto");
                        String material = sc.nextLine();
                        ProductoRopa productoRopa = new ProductoRopa(nombre, precio, cantidad, descripcion, talla,
                                color, material);
                        try {
                            cliente.agregarProducto(productoRopa);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } else if (tipoProducto == 2) {
                        System.out.println("Ingresa la marca del producto");
                        String marca = sc.next();
                        System.out.println("Ingresa el modelo del producto");
                        String modelo = sc.next();
                        System.out.println("Ingresa el número de serie del producto");
                        String numeroSerie = sc.next();
                        ProductoElectronico productoElectronico = new ProductoElectronico(nombre, precio, cantidad,
                                descripcion, marca, modelo, numeroSerie);
                        try {
                            cliente.agregarProducto(productoElectronico);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del producto a eliminar");
                    String nombreProducto = sc.nextLine();
                    boolean eliminado = false;
                    ArrayList<Producto> productosAEliminar = new ArrayList<Producto>();
                    for (Producto producto : cliente.getProductosComprados()) {
                        if (producto.getNombre().equals(nombreProducto)) {
                            productosAEliminar.add(producto);
                            eliminado = true;
                        }
                    }
                    if (eliminado) {
                        for (Producto producto : productosAEliminar) {
                            try {
                                cliente.quitarProducto(producto);
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                    } else {
                        System.out.println("Error: No se encontró el producto");
                    }
                    break;
                case 3:
                    System.out.println("Productos comprados por " + cliente.getNombre());
                    for (int i = 0; i < cliente.getProductosComprados().size(); i++) {
                        System.out.println(i + 1 + ". " + cliente.getProductosComprados().get(i).getNombre());
                        System.out.println(cliente.getProductosComprados().get(i).toString());
                    }
                    break;
                case 4:
                    double total = 0.00;
                    double descuento = 0.00;
                    if (cliente.getProductosComprados().size() > 5) {
                        descuento = 0.10;
                    } else if (cliente.getProductosComprados().size() > 10) {
                        descuento = 0.15;
                    } else {
                        descuento = 0.00;
                    }
                    System.out.println("Compra realizada por " + cliente.getNombre());
                    for (Producto producto : cliente.getProductosComprados()) {
                        double precioTotalDelProducto = producto.getPrecio() * producto.getCantidad();
                        double precioConDescuento = producto.calcularPrecio(precioTotalDelProducto, descuento);
                        System.out.println("Producto: " + producto.getNombre());
                        System.out.println("Precio: " + producto.getPrecio());
                        System.out.println("Cantidad: " + producto.getCantidad());
                        System.out.println("Precio total: " + precioTotalDelProducto);
                        System.out.println("Precio con descuento: " + precioConDescuento);
                        total += precioConDescuento;
                    }
                    System.out.println("Total pagado: " + total);
                    break;
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Ver el carrito");
        System.out.println("4. Realizar la compra");
        System.out.println("5. Salir");
    }

    public static int obtenerNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.println(mensaje);
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);
        return numero;
    }

    public static int obtenerNumero() {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);
        return numero;
    }

    public static int elegirOpcion() {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = obtenerNumero("Ingresa una opción: ");

            if (opcion < 1 || opcion > 5) {
                System.out.println("Error: Debes ingresar una opción válida");
            }

        } while (opcion < 1 || opcion > 5);
        return opcion;
    }
}