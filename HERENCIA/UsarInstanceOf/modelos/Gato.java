package UsarInstanceOf.modelos;
import UsarInstanceOf.modelos.Animal;

public class Gato extends Animal{
    private String raza;
    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public void maullar() {
        System.out.println(this.nombre + " está maullando");
    }

    // Sobreescribiendo metodos
    @Override
    public void comer() {
        System.out.println("El gato " + this.nombre + " está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El gato " + this.nombre + " está durmiendo en el sofá");
    }

    public void setRaza(String nuevaRaza) {
        this.raza = nuevaRaza;
    }
    public String getRaza() {
        return this.raza;
    }
}
