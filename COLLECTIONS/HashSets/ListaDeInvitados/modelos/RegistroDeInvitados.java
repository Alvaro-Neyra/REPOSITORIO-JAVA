package modelos;

import java.util.HashSet;

public class RegistroDeInvitados {
    private HashSet<String> invitados = new HashSet<String>();

    public void agregar(String nombre) {
        invitados.add(nombre);
    }

    public void eliminar(String nombre) {
        invitados.remove(nombre);
    }

    public void mostrarInvitados() {
        for (String invitado: invitados) {
            System.out.println(invitado);
        }
    }
}
