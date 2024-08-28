package GeometriaAbstracta.modelos;

public class Circulo extends Figura implements Dibujable {
    @Override
    public void calcularArea() {
        System.out.println("Calculando area de Circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Circulo");
    }
}