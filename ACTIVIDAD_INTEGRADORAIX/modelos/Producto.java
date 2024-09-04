package modelos;
import servicios.Comprable;

public class Producto implements Comprable {
    private String nombre;
    private int precio;
    private int cantidad;
    private String descripcion;

    public Producto(String nombre, int precio, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    @Override
    public double calcularPrecio(double precioDelProducto, double descuento) {
        return (precioDelProducto - (precioDelProducto * descuento));
    }
    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}