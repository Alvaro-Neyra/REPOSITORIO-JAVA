package EjercicioFiguras.modelos;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        return base * 3;
    }

    // Getters
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
}
