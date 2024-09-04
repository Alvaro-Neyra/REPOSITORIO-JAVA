package SALUDOALUSUARIO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "";
        try {
            nombre = solicitarString("Ingrese su nombre: ");
            System.out.println("Hola " + nombre + "!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String solicitarString(String mensaje) throws Exception{
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        try {
            System.out.print(mensaje);
            cadena = sc.nextLine();
            if (cadena.length() < 2) {
                throw new Exception("Error: La cadena debe tener al menos 2 caracteres.");
            }
        } catch (Exception e) {
            throw e;
        }finally{
            sc.close();
        }
        return cadena;
    }
}
