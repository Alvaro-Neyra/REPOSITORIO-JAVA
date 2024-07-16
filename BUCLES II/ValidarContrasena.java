import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidarContrasena {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            
            String contrasena = "secreto";
            
            String contrasenaIntroducida = "";
            
            System.out.print("Introduce la contraseña: ");
            contrasenaIntroducida = sc.nextLine();
            
            while (contrasena.equals(contrasenaIntroducida) == false) {
                System.out.print("Contraseña incorrecta. Introduce la contraseña: ");
                contrasenaIntroducida = sc.nextLine();
            }
            
            if (contrasena.equals(contrasenaIntroducida)) {
                System.out.println("Contraseña correcta.");
            }
            
            sc.close();
        } catch(InputMismatchException e) {
            System.out.println("Error: Debe introducir letras.");
            main(args);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }
}
