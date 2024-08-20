package EjercicioFiguras.modelos;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor por defecto
    public Rectangulo() {
        ancho = 1.0;
        alto = 1.0;
    }

    // Constructor con parámetros
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Getters y Setters
    // Getters
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
    // Setters: Los setters solo deben tener logica no imprimir mensajes
    public void setAncho(double ancho) {
        if (ancho < 0) {
            this.ancho = 0;
        } else {
            this.ancho = ancho;
        }
    }
    public void setAlto(double alto) {
        if (alto < 0) {
            this.alto = 0;
        } else {
            this.alto = alto;
        }
    }

    // Métodos
    public double area() {
        return ancho * alto;
    }
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public void mostrar() {
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
