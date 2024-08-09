
public class GenerarNumeroAleatorio {
    public static void main(String[] args) {
        int numero = generarNumeroAleatorio();
        System.out.println("Número aleatorio: " + numero);
    }

    public static int generarNumeroAleatorio() {
        return (int) (Math.random() * (355 - 1 + 1) + 1);
    }
}
