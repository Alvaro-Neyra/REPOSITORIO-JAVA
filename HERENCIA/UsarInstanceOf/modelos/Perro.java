package UsarInstanceOf.modelos;
import UsarInstanceOf.modelos.Animal;

public class Perro extends Animal{
    private String raza;
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public void ladrar() {
        System.out.println(this.nombre + " está ladrando");
    }

    // Sobreescribiendo metodos
    @Override
    public void comer() {
        System.out.println("El perro " + this.nombre + " está comiendo croquetas");
    }

    @Override
    public void dormir() {
        System.out.println("El perro " + this.nombre + " está durmiendo en su casita");
    }

    public void setRaza(String nuevaRaza) {
        this.raza = nuevaRaza;
    }
    public String getRaza() {
        return this.raza;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Perro perro = (Perro) obj;
        return nombre.equals(perro.nombre) && edad == perro.edad && raza.equals(perro.raza);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1 * super.hashCode();
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
}
