package HerenciaSimpleII;
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

        System.out.println("Metodos sobresecritos");
        perro.comer();
        perro.dormir();

        Perro otroPerro = new Perro("Firulais", 5, "Pastor Alemán");
        System.out.println("¿Son iguales? " + perro.equals(otroPerro));
        System.out.println("Hashcode de perro: " + perro.hashCode());
        System.out.println("Hashcode de otroPerro: " + otroPerro.hashCode());

        System.out.println("Hashcode de gato: " + gato.hashCode());

    }
}
