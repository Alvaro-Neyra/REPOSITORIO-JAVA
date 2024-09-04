package DiaDeLaSemana.enums;

public enum DiaDeSemana {

    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public boolean esDiaLaboral() {
        if (this == SABADO || this == DOMINGO) {
            return false;
        } else {
            return true;
        }
    }

    public String getDia() {
        return this.toString();
    }
}
