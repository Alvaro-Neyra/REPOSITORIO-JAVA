package modelos;

public class Jugador extends Persona {
    private int numeroCamiseta;
    
    public Jugador(String nombre, int edad, Equipo equipo, int numeroCamiseta) {
        super(nombre, edad, equipo);
    }

    @Override
    public void gritarGol() {
        System.out.println(getNombre() + "(Jugador) con camiseta numero: " + numeroCamiseta + " grita: !Golazo!");
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}