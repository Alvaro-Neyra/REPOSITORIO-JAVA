package BUCLES;

public class ConcatenandoElementos {
    public static void main(String[] args) {
        
        // Generando un arreglo de cadenas de texto de tamanio 10
        String[] arregloDeCadenas = new String[]{"Hola", "Mundo", "Java", "Programacion", "POO", "Bucles", "Condicionales", "Metodos", "Clases", "Objetos"};
        
        String concatenacion = "";
        
        for (String palabra: arregloDeCadenas) {
            concatenacion += palabra + " ";
        }

        System.out.println("La concatenacion de las palabras del arreglo es: " + concatenacion);
    }
}
