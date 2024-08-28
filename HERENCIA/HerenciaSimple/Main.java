package HerenciaSimple;
import HerenciaSimple.modelos.Perro;
import HerenciaSimple.modelos.Gato;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", 5, "Pastor Alemán");
        Gato gato = new Gato("Garfield", 3, "Persa");

        
        perro.dormir();
        perro.ladrar();
        System.out.println("La raza de " + perro.getNombre() + " es " + perro.getRaza());

        gato.comer();
        gato.dormir();
        gato.maullar();
        System.out.println("La raza de " + gato.getNombre() + " es " + gato.getRaza());
    }
}
