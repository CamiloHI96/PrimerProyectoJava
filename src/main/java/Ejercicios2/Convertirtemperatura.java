package Ejercicios2;

import java.util.Scanner;

public class Convertirtemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convertir de Celsius a Fahrenheit");
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}