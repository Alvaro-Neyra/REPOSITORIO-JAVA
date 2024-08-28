package modelos;

public class Entrenador extends Persona{
    public Entrenador(String nombre, int edad, Equipo equipo) {
        super(nombre, edad, equipo);
    }

    @Override
    public void gritarGol() {
        System.out.println(getNombre() + "(Entrenador) grita: !Gol!");
    }
}
