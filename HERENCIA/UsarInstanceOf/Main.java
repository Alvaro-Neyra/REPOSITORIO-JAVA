package UsarInstanceOf;
import UsarInstanceOf.modelos.Perro;
import UsarInstanceOf.modelos.Gato;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> animales = new ArrayList<>(10);
        
        // Crear cinco perros y cinco gatos con valores de los atributos diferentes
        Perro perro1 = new Perro("Firulais", 5, "Pastor Aleman");
        Perro perro2 = new Perro("Rex", 3, "Bulldog");
        Perro perro3 = new Perro("Scooby", 7, "Gran Danes");
        Perro perro4 = new Perro("Pluto", 2, "Dalmata");
        Perro perro5 = new Perro("Goofy", 4, "San Bernardo");
        Gato gato1 = new Gato("Garfield", 6, "Naranja");
        Gato gato2 = new Gato("Tom", 3, "Gris");
        Gato gato3 = new Gato("Silvestre", 4, "Neg");
        Gato gato4 = new Gato("Felix", 3, "Persa");
        Gato gato5 = new Gato("Gaturro", 5, "Siames");

        // Agregar los perros y gatos al ArrayList
        animales.add(perro1);
        animales.add(perro2);
        animales.add(perro3);
        animales.add(perro4);
        animales.add(perro5);
        animales.add(gato1);
        animales.add(gato2);
        animales.add(gato3);
        animales.add(gato4);
        animales.add(gato5);

        for (int i = 0 ; i < animales.size(); i++) {
            if (animales.get(i) instanceof Perro perro) {
                perro = (Perro) animales.get(i);
                System.out.println("Perro: " + perro.getNombre() + " " + perro.getEdad() + " " + perro.getRaza());
                perro.ladrar();
                perro.comer();
                perro.dormir();
            } else if (animales.get(i) instanceof Gato gato) {
                gato = (Gato) animales.get(i);
                System.out.println("Gato: " + gato.getNombre() + " " + gato.getEdad() + " " + gato.getRaza());
                gato.maullar();
                gato.comer();
                gato.dormir();
            }
        }
    }
}
