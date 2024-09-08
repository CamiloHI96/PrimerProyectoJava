package Ejercicios2;
import java.util.Scanner;

public class Tablamultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabla de multiplicar");
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
