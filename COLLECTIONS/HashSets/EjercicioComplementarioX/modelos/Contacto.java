package EjercicioComplementarioX.modelos;
import java.util.Objects;

public class Contacto {
    private String nombre;
    private String numeroTelefono;
    private String correoElectronico;

    public Contacto(String nombre, String numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Telefono: " + numeroTelefono + ", Correo: " + correoElectronico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public boolean equals(Object obj) {
        // Este metodo se sobreescribe para que el metodo contains de la clase ArrayList compare los objetos de tipo Contacto por valor y no por referencia
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Contacto contacto = (Contacto) obj;
        return nombre.equals(contacto.nombre);

    }
}
