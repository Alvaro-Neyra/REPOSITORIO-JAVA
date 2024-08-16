class Auto {
    private String marca;
    private String modelo;
    private int anio;

    // Constructores
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {}

    public void imprimirDatos() {
        if (marca != null || modelo != null || anio != 0) {
            if (marca != null) {
                System.out.println("Marca: " + marca);
            }
            if (modelo != null) {
                System.out.println("Modelo: " + modelo);
            }
            if (anio != 0) {
                System.out.println("Año: " + anio);
            }
        } else {
                System.out.println("No se ha inicializado ningún dato del auto.");
        }
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Ford", "Fiesta", 2010);
        auto1.imprimirDatos();
        Auto auto2 = new Auto("Chevrolet", "Corsa");
        auto2.imprimirDatos();
        Auto auto3 = new Auto("Renault");
        auto3.imprimirDatos();
        Auto auto4 = new Auto();
        auto4.imprimirDatos();
    }
}
