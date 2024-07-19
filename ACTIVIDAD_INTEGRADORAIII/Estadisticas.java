import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estadisticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tamanio = 5;
        boolean error = false;

        do {
            try {
                do {
                    System.out.print("Introduce el tamaño del array: ");
                    tamanio = sc.nextInt();
                } while (tamanio < 5);
                error = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Debes introducir un número entero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + (e.getMessage() != null ? e.getMessage() : "Error desconocido"));
                sc.nextLine();
            }
        } while (!error);
        
        String[] array = new String[tamanio];

        String[] arrayRelleno = rellenarArray(array);

        float[] arrayFloat = convertirArrayStringAFloat(arrayRelleno);

        float[] desaprobados = new float[0];
        float[] aprobados = new float[0];
        float[] excelentes = new float[0];

        for (int i = 0; i < arrayFloat.length; i++) {
            if (arrayFloat[i] < 4) {
                desaprobados = aniadirAlFinal(desaprobados, arrayFloat[i]);
            } else if (arrayFloat[i] >= 4 && arrayFloat[i] < 7) {
                aprobados = aniadirAlFinal(aprobados, arrayFloat[i]);
            } else {
                excelentes = aniadirAlFinal(excelentes, arrayFloat[i]);
            }
        }

        calcularPromedio(arrayFloat, "Todos");
        calcularPromedio(desaprobados, "Desaprobados");
        calcularPromedio(aprobados, "Aprobados");
        calcularPromedio(excelentes, "Excelentes");
        sc.close();

    }

    public static String[] rellenarArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(generarNumeroAleatorio(1, 10));
        }
        return array;
    }

    public static float generarNumeroAleatorio(int min, int max) {
        float numeroAleatorio = (float) (Math.random() * (max - min + 1) + min);
        return redondearA2Decimales(numeroAleatorio);
    }

    public static float redondearA2Decimales(float valor) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Float.parseFloat(df.format(valor));
    }

    public static void mostrarArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static float[] convertirArrayStringAFloat(String[] array) {
        float[] arrayFloat = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayFloat[i] = Float.valueOf(array[i]);
        }
        return arrayFloat;
    }

    public static float[] aniadirAlFinal(float[] array, float numero) {
        float[] arrayNuevo = new float[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNuevo[i] = array[i];
        }
        arrayNuevo[array.length] = numero;
        return arrayNuevo;
    }

    public static void calcularPromedio(float[] array, String mensaje) {
        float suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        float promedio = suma / array.length;
        System.out.println("Promedio de " + mensaje + ": " + redondearA2Decimales(promedio));
    }
}