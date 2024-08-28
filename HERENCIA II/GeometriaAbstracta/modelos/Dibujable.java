package GeometriaAbstracta.modelos;

public interface Dibujable {
    void dibujar();
}

abstract class Figura {
    public Figura() {
        // Constructor opcional de la clase Figura
    }
    public abstract void calcularArea();
}