package GestionDeReservas.modelos;
import java.util.HashMap;

public class SistemaGestionReservas {
    HashMap<String, Reserva> reservas = new HashMap<String, Reserva>();

    public void addReserva(Reserva reserva) {
        reservas.put(reserva.getIdReserva(), reserva);
    }

    public void removeReserva(String idReserva) {
        boolean existe = reservas.containsKey(idReserva);
        if (existe) {
            reservas.remove(idReserva);
        } else {
            System.out.println("La reserva no existe");
        }
    }

    public void getReserva(String idReserva) {
        boolean existe = reservas.containsKey(idReserva);
        if (existe) {
            Reserva reserva = reservas.get(idReserva);
            System.out.println(reserva.toString());
        } else {
            System.out.println("La reserva no existe");
        }
    }

    public void showReservas() {
        int cantidad = reservas.size();
        System.out.println("Cantidad total de reservas: " + cantidad);
        for (String idReserva : reservas.keySet()) {
            String info = reservas.get(idReserva).toString();
            System.out.println(info);
        }
    }

    public HashMap<String, Reserva> getReservas() {
        return reservas;
    }
}


