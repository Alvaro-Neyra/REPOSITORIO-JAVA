package GeometriaAbstracta.modelos;

public class Triangulo extends Figura implements Dibujable {
    @Override
    public void calcularArea() {
        System.out.println("Calculando area de Triangulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triangulo");
    }
}