package Ejercicios2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Adivinarelnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        int intento;
        int intentos = 0;
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He pensado en un número entre 1 y 100. ¿Puedes adivinar cuál es?");
        
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            intentos++;
            
            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (intento != numeroAleatorio);
        
        scanner.close();
    }
}
