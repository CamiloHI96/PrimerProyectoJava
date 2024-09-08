package Ejercicios2;

import java.util.Scanner;

public class Contardigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Conteo de digitos de un numero");
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int digitos = contarDigitos(numero);
        
        System.out.println("El número " + numero + " tiene " + digitos + " dígitos.");
        
        scanner.close();
    }
    
    public static int contarDigitos(int numero) {
        numero = Math.abs(numero); // Asegurarse de que el número sea positivo
        if (numero == 0) {
            return 1;
        }
        return (int) Math.log10(numero) + 1;
    }
}