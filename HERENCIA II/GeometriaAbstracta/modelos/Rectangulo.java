package GeometriaAbstracta.modelos;

public class Rectangulo extends Figura implements Dibujable {
    @Override
    public void calcularArea() {
        System.out.println("Calculando area de Rectangulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Rectangulo");
    }
}