package GestionBiblioteca.modelos;
import GestionBiblioteca.modelos.ItemBiblioteca;

public class Revista extends GestionBiblioteca.modelos.ItemBiblioteca{
    private String titulo;
    private int numEjemplar;
    private boolean prestado;

    public Revista(String titulo, int numEjemplar) {
        this.titulo = titulo;
        this.numEjemplar = numEjemplar;
        this.prestado = false;
    }

    public void prestar() {
        if (this.numEjemplar > 0) {
            this.numEjemplar--;
            this.prestado = true;
        } else {
            System.out.println("No hay ejemplares disponibles de la revista " + this.titulo);
        }
        this.prestado = true;

    }

    public void devolver() {
        this.prestado = false;
        if (this.numEjemplar > 0) {
            this.numEjemplar++;
        } else {
            System.out.println("No se pueden devolver más ejemplares de la revista " + this.titulo);
        }
    }

    public void obtenerInformacion() {
        System.out.println("Información de la revista " + this.titulo);
        System.out.println("Cantidad de ejemplares: " + this.getNumEjemplar());
        System.out.println("Prestado: " + this.getPrestado());
    }

    public void calcularMultas() {
        System.out.println("Calculando multas para la revista " + this.titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getNumEjemplar() {
        return this.numEjemplar;
    }

    public boolean getPrestado() {
        return this.prestado;
    }
}
