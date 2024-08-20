package EjercicioPlano;
import java.util.InputMismatchException;

import EjercicioPlano.modelos.Punto;

public class Main {
    private static Punto[] puntos = new Punto[3];
    public static void main(String[] args) {
        System.out.println("Bienvendio al programa de puntos");
        System.out.println("Ingrese las coordenadas de los puntos");
        Main programa = new Main();
        programa.iniciar();
    }

    public void iniciar() {
        for (int i = 0; i < puntos.length; i++) {
            double x = pedirDouble("Ingrese la coordenada x del punto " + (i + 1));
            double y = pedirDouble("Ingrese la coordenada y del punto " + (i + 1));
            puntos[i] = new Punto(x, y);
        }
        double distancia = Punto.calcularDistanciaEntreDosPuntos(puntos[0], puntos[1]);
        System.out.println("La distancia entre los puntos 1 y 2 es: " + distancia);
        if (Punto.estanAlineados(puntos[0], puntos[1], puntos[2])) {
            System.out.println("Los puntos están alineados");
        } else {
            System.out.println("Los puntos no están alineados");
        }
    }

    public double pedirDouble(String mensaje) {
        boolean error = false;
        double numero = 0;
        do {
            error = false;
            try {
                do {
                    System.out.println(mensaje);
                    numero = Double.parseDouble(System.console().readLine());
                    if (numero <= 0) {
                        System.out.println("Error: Debe ingresar un número positivo o cero");
                    }
                } while (numero <= 0);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número");
                error = true;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número");
                error = true;
            }
        } while (error);
        return numero;
    }
}
