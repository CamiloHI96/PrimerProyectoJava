package Ejercicios2;

public class Mayorymenordeunarray {
    public static void main(String[] args) {
        System.out.println("Mayor y menor de un array o lista");
        int[] numeros = {3, 5, 7, 2, 8, -1, 4, 10, 12, -5};
        
        int max = numeros[0];
        int min = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        
        System.out.println("El número más grande es: " + max);
        System.out.println("El número más pequeño es: " + min);
    }
}