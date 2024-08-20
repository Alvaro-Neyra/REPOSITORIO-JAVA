package EjercicioEjemplo;
public class EjemploModificadoresAcceso {
    public static void main(String[] args) {
        // Crear un objeto de la clase Ejemplo
        Ejemplo objeto = new Ejemplo();
        // Acceder a los atributos y métodos de la clase Ejemplo
        objeto.mostrarMensaje();
        objeto.setNumero(10);
        int numero = objeto.getNumero();
        System.out.println("El número es: " + numero);
    }

    // Usar el modificador de acceso protected
    protected static void metodoProtegido() {
        System.out.println("¡Hola desde el método protegido!");
    }
}

// Clase Ejemplo
class Ejemplo {
    // Atributo privado
    private int numero;

    // Método público que establece el valor del atributo privado
    public void setNumero(int n) {
        // Validar que el número sea positivo antes de asignarlo al atributo
        if (n > 0) {
            numero = n;
        } else {
            System.out.println("Error: El número debe ser positivo.");
        }
    }

    // Método público que devuelve el valor del atributo privado
    public int getNumero() {
        return numero;
    }

    // Método público que muestra un mensaje
    public void mostrarMensaje() {
        System.out.println("¡Hola desde la clase Ejemplo!");
    }
}

// Private: Acceso solo desde la misma clase
// Public: Acceso desde cualquier clase
// Protected: Acceso desde la misma clase, clases del mismo paquete y subclases
// Default: Acceso desde la misma clase y clases del mismo paquete