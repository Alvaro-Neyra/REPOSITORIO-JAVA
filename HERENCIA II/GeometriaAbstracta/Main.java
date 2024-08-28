package GeometriaAbstracta;
import GeometriaAbstracta.modelos.Circulo;
import GeometriaAbstracta.modelos.Rectangulo;
import GeometriaAbstracta.modelos.Triangulo;



public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();

        circulo.calcularArea();
        circulo.dibujar();

        rectangulo.calcularArea();
        rectangulo.dibujar();

        triangulo.calcularArea();
        triangulo.dibujar();
    }
}

