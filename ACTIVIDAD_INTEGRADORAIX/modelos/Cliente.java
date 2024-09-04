package modelos;
import java.util.ArrayList;
import exceptions.NoExistenciasException;
import exceptions.NoEncontradoEnListaException;

public class Cliente {
    private String nombre;
    private ArrayList<Producto> productosComprados;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.productosComprados = new ArrayList<Producto>();
    }

    // Setters y Getters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductosComprados() {
        return this.productosComprados;
    }

    public void agregarProducto(Producto producto) throws NoExistenciasException {
        if (producto.getCantidad() > 0) {
            producto.setCantidad(producto.getCantidad() - 1);
            this.productosComprados.add(producto);
        } else {
            throw new NoExistenciasException("No hay existencias del producto " + producto.getNombre());
        }
    }

    public void quitarProducto(Producto producto) throws NoEncontradoEnListaException {
        if (this.productosComprados.contains(producto)) {
            producto.setCantidad(producto.getCantidad() + 1);
            this.productosComprados.remove(producto);
        } else {
            throw new NoEncontradoEnListaException("El producto " + producto.getNombre() + " no se encuentra en la lista de productos comprados");
        }
    }
}
