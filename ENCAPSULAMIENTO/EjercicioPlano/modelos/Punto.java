package EjercicioPlano.modelos;

public class Punto {
    private double x;
    private double y;

    // Constructor por defecto
    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters y Setters
    // Getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public void setY(double y) {
        if (y >= 0) {
            this.y = y;
        }
    }

    // Metodos
    public static double calcularDistanciaEntreDosPuntos(Punto punto1, Punto punto2) {
        double distancia = 0;
        distancia = Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
        return distancia;
    }

    public static boolean estanAlineados(Punto punto1, Punto punto2, Punto punto3) {
        boolean alineados = false;
        double pendiente1 = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
        double pendiente2 = (punto3.getY() - punto2.getY()) / (punto3.getX() - punto2.getX());
        if (pendiente1 == pendiente2) {
            alineados = true;
        }
        return alineados;
    }
}

