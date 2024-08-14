class ProgramaConBucle {
    public static void main(String[] args) {
        int[] numeros = generarArreglo();
        sumarArreglo(numeros);
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max-min+1) + min);
    }

    public static int[] generarArreglo() {
        int longitudDelArreglo = numeroAleatorio(5, 10);
        int[] arreglo = new int[longitudDelArreglo];
        for (int i = 0; i < longitudDelArreglo; i++) {
            arreglo[i] = numeroAleatorio(1, 100);
        }
        return arreglo;
    }

    public static void sumarArreglo(int[] arreglo) {
        int suma = 20;

        for (int i : arreglo) {
            suma += i;
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);
    } 
}