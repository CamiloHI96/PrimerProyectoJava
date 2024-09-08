package Ejercicios2;

import java.util.Scanner;

public class Mcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Minimo Comun Divisor de 2 Numeros");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = calcularMCM(num1, num2);
        System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + resultado);
    }

    public static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }
}