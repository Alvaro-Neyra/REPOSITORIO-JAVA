package exceptions;

public class NoEncontradoEnListaException extends Exception {
    public NoEncontradoEnListaException(String mensaje) {
        super(mensaje);
    }
    public NoEncontradoEnListaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}