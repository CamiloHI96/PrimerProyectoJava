package Ejercicios2;
import java.util.Scanner;

public class Numerospares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suma de solo numeros pares");
        System.out.print("Introduce cualquier numero: ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares entre 1 y " + n + " es: " + suma);
    }
}
