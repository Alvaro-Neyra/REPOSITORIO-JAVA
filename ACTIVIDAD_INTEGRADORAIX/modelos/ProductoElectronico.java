package modelos;
import modelos.Producto;

public class ProductoElectronico extends Producto{
    private String marca;
    private String modelo;
    private String numeroSerie;

    public ProductoElectronico(String nombre, int precio, int cantidad, String descripcion, String marca, String modelo, String numeroSerie) {
        super(nombre, precio, cantidad, descripcion);
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
    // Getters y Setters
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeroSerie() {
        return this.numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}