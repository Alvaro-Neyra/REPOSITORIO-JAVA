package GestionDeReservas.modelos;

public class Reserva {
    private String idReserva;
    private String fechaReserva;
    private String nombreReserva;

    public Reserva(String idReserva, String fechaReserva, String nombreReserva) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.nombreReserva = nombreReserva;
    }

    // Getters
    public String getIdReserva() {
        return idReserva;
    }
    public String getFechaReserva() {
        return fechaReserva;
    }

    public String getNombreReserva() {
        return nombreReserva;
    }

    // Setters
    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva='" + idReserva + '\'' +
                ", fechaReserva='" + fechaReserva + '\'' +
                ", nombreReserva='" + nombreReserva + '\'' +
                '}';
    }
}
