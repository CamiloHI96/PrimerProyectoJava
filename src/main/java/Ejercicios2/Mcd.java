package Ejercicios2;

import java.util.Scanner;

public class Mcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Maximo Comun dividor de 2 Numeros");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = calcularMCD(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + resultado);
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
