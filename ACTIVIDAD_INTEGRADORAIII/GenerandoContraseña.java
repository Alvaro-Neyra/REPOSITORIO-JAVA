import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GenerandoContraseña {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean valorValido = false;
      do {
         try {
            System.out.print("Introduce la longitud de la contraseña (debe ser mayor a 3): ");
            int longitud = scanner.nextInt();
            if (longitud < 3) {
               throw new Exception("La longitud de la contraseña debe ser al menos 3.");
            }
            System.out.println("Contraseña generada: " + generarContrasena(longitud));
            valorValido = true;
         } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido.");
            scanner.next();
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
      } while (!valorValido);

      scanner.close();
   }

   public static String generarContrasena(int longitud) {
      Random random = new Random();
      char[] contrasena = new char[longitud];
      boolean tieneMayuscula = false;
      boolean tieneMinuscula = false;
      boolean tieneDigito = false;

      do {
         for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(3);
            char c;
            switch (tipo) {
               case 0:
                  c = (char) (random.nextInt(10) + '0');
                  contrasena[i] = c;
                  break;
               case 1:
                  c = (char) (random.nextInt(26) + 'A');
                  contrasena[i] = c;
                  break;
               case 2:
                  c = (char) (random.nextInt(26) + 'a');
                  contrasena[i] = c;
                  break;
               default:
                  c = ' ';
                  contrasena[i] = c;
                  break;
            }
         }

         tieneMayuscula = false;
         tieneMinuscula = false;
         tieneDigito = false;

         int i = 0;
         while (i < longitud && (!tieneMayuscula || !tieneMinuscula || !tieneDigito)) {
            char c = contrasena[i];
            if (Character.isUpperCase(c)) {
               tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
               tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
               tieneDigito = true;
            }
            i++;
         }
      } while (!tieneMayuscula || !tieneMinuscula || !tieneDigito);

      return new String(contrasena);
   }
}