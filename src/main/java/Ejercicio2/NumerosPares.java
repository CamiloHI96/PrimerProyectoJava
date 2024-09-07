package Ejercicio2;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares entre 1 y " + n + " es: " + suma);
    }
}
