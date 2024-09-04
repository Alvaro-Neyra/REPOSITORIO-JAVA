package exceptions;

public class NoExistenciasException extends Exception {
    public NoExistenciasException(String mensaje) {
        super(mensaje);
    }
    public NoExistenciasException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
