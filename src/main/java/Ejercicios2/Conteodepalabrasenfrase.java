package Ejercicios2;

import java.util.Scanner;

public class Conteodepalabrasenfrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conteo de palabras en frase");
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();
        
        // Dividir la frase en palabras usando espacios como delimitadores
        String[] palabras = frase.trim().split("\\s+");
        
        // Contar el número de palabras
        int numeroDePalabras = palabras.length;
        
        System.out.println("La frase tiene " + numeroDePalabras + " palabras.");
        
        scanner.close();
    }
}
