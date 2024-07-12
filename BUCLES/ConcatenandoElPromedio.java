package BUCLES;

public class ConcatenandoElPromedio {
    public static void main(String[] args) {
        float promedio = 0;
        float[] arregloDeFlotantes = new float[] {1.2f, 3.4f, 5.6f, 7.8f, 9.0f, 12.3f, 14.5f, 16.7f, 18.9f, 20.1f, 129.3f, 123.4f, 178.9f, 99.9f, 65.4f, 82.3f, 23.4f, 45.6f};
        float suma = 0;
        for (float elemento: arregloDeFlotantes) {
            suma += elemento;
        }

        promedio = suma / arregloDeFlotantes.length;

        System.out.println("El resultado de la suma de los elementos del arreglo es: " + suma);
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }
}
