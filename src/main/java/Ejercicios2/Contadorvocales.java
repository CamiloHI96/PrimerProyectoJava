package Ejercicios2;

import java.util.Scanner;

public class Contadorvocales {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Contador de Vocales");
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("El número de vocales en la cadena es: " + contador);
    }
}
