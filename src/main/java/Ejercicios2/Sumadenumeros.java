package Ejercicios2;

import java.util.Scanner;

public class Sumadenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Suma de Numeros hasta ingresar un cero");
            System.out.print("Introduce un número (0 para terminar): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
