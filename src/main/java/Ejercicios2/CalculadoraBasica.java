package Ejercicios2;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculadora Basica");
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Elige una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}