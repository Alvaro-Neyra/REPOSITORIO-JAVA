package EjercicioFiguras.modelos;

public class Circulo {
    private double radio;
    private final double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * PI * radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    // Setters
    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }
}
