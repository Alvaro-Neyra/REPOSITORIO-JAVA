package modelos;
import modelos.Producto;

public class ProductoRopa extends Producto{
    private String talla;
    private String color;
    private String material;

    public ProductoRopa(String nombre, int precio, int cantidad, String descripcion, String talla, String color, String material) {
        super(nombre, precio, cantidad, descripcion);
        this.talla = talla;
        this.color = color;
        this.material = material;
    }
    // Getters y Setters
    public String getTalla() {
        return this.talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nPrecio: " + this.getPrecio() + "\nCantidad: " + this.getCantidad() + "\nDescripción: " + this.getDescripcion() + "\nTalla: " + this.talla + "\nColor: " + this.color + "\nMaterial: " + this.material;
    }
}
