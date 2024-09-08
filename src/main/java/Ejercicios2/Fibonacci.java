package Ejercicios2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Serie de Fibonacci");
        System.out.print("Introduce el número de términos: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Secuencia de Fibonacci: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;
            b = siguiente;
        }
    }
}