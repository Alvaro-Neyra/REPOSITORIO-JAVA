package GestionBiblioteca;

import GestionBiblioteca.modelos.Libro;
import GestionBiblioteca.modelos.Pelicula;
import GestionBiblioteca.modelos.Revista;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1200);
        Pelicula pelicula = new Pelicula("El padrino", "Francis Ford Coppola", 175);
        Revista revista = new Revista("National Geographic", 2021);

        libro.prestar();
        pelicula.prestar();
        revista.prestar();

        libro.calcularMultas();
        pelicula.calcularMultas();
        revista.calcularMultas();

        ArrayList<Revista> revistas = new ArrayList<>(3); 
        revistas.add(new Revista("Revista 1", 2021));
        revistas.add(new Revista("Revista 2", 2022));
        revistas.add(new Revista("Revista 3", 2022));

        for (int i = 0 ; i < revistas.size(); i++) {
            revistas.get(i).prestar();
            revistas.get(i).calcularMultas();
        }
    }
}
