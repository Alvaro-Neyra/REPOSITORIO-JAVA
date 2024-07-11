import java.util.Scanner;

public class BuscandoUnElemento {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
    numeros[0] = 14;
    numeros[1] = 20;
    numeros[2] = 30;
    
    System.out.print("Ingresa el numero a buscar: ");
    
    int numeroABuscar = sc.nextInt();
    
    if (numeroABuscar == numeros[0] || numeroABuscar == numeros[1] || numeroABuscar == numeros[2]) {
        System.out.println("El numero " + numeroABuscar + " se encuentra en el arreglo");
    } else {
        System.out.println("El numero " + numeroABuscar + " no se encuentra en el arreglo");
    }
    
    sc.close();
    }
}
