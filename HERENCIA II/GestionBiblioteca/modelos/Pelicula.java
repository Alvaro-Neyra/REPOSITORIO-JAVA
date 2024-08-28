package GestionBiblioteca.modelos;
import GestionBiblioteca.modelos.ItemBiblioteca;

public class Pelicula extends GestionBiblioteca.modelos.ItemBiblioteca {
    private String titulo;
    private String director;
    private int duracion;
    private boolean prestado;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.prestado = false;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public void calcularMultas() {
        System.out.println("Calculando multas para la pelicula " + this.titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public boolean getPrestado() {
        return this.prestado;
    }
    
}
