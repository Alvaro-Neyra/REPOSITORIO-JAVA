package EjercicioComplementarioX.modelos;
import java.util.ArrayList;
import java.util.HashSet;


public class GestorDeContactos {
    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private HashSet<Contacto> contactosSet = new HashSet<Contacto>();

    public void agregarContactoArrayList(Contacto contacto) {
        if (contacto.getNombre().isEmpty() || contacto.getNumeroTelefono().isEmpty() || contacto.getCorreoElectronico().isEmpty()) {
            System.out.println("No se puede agregar un contacto con campos vacios");
        } else {
            if (contactos.contains(contacto)) { // Comparando por valor los objetos
                System.out.println("El contacto ya existe");
            } else {
                contactos.add(contacto);
            }
        }
    }
    
    public void eliminarContactoArrayList(Contacto contacto) {
        if (contactos.contains(contacto)) {
            contactos.remove(contacto);
        } else {
            System.out.println("El contacto no existe");
        }
    }

    public void agregarContactoHashSet(Contacto contacto) {
        if (contacto.getNombre().isEmpty() || contacto.getNumeroTelefono().isEmpty() || contacto.getCorreoElectronico().isEmpty()) {
            System.out.println("No se puede agregar un contacto con campos vacios");
        } else {
            if (contactosSet.add(contacto)){ // Comparando por valor los objetos al agregar al HashSet
                System.out.println("El contacto ya existe");
            }
        }
    }

    public void eliminarContactoHashSet(Contacto contacto) {
        if (contactosSet.remove(contacto)) {
            System.out.println("El contacto ha sido eliminado");
        }
    }

    public void mostrarContactosHashSets() {
        if (contactosSet.isEmpty()) {
            System.out.println("No hay contactos");
        } else {
            for (Contacto contacto : contactosSet) {
                String descripcionHash = contacto.toString();
                System.out.println(descripcionHash);
            }
        }
    }

    public void mostrarContactosArrayList() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos");
        } else {
            for (Contacto contacto : contactos) {
                String descripcionArray = contacto.toString();
                System.out.println(descripcionArray);
            }
        }
    }
}
