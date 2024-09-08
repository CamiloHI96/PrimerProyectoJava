package Ejercicios2;

import java.util.Scanner;

public class Ordenartresnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ordenar 3 Numeros");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Los números ordenados de menor a mayor son: " + num1 + ", " + num2 + ", " + num3);
    }
}