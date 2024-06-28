import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("INGRESE UN NUMERO: ");
        int primerNumero = miScanner.nextInt();

        System.out.print("INGRESE OTRO NUMERO: ");
        int segundoNumero = miScanner.nextInt();

        int resultadoSuma = primerNumero + segundoNumero;
        int resultadoResta = primerNumero - segundoNumero;
        int resultadoMultiplicacion = primerNumero * segundoNumero;
        double resultadoDivision = (double) primerNumero / segundoNumero;
        int resultadoModulo = primerNumero % segundoNumero;

        System.out.println("EL RESULTADO DE LA SUMA ES: " + resultadoSuma);
        System.out.println("EL RESULTADO DE LA RESTA ES: " + resultadoResta);
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + resultadoMultiplicacion);
        System.out.println("EL RESULTADO DE LA DIVISION ES: " + resultadoDivision);
        System.out.println("EL RESULTADO DEL MODULO ES: " + resultadoModulo);

        miScanner.close();
    }
}
