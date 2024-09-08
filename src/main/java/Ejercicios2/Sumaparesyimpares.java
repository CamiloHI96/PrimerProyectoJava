package Ejercicios2;

public class Sumaparesyimpares {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8, -1, 4, 10, 12, -5};
        
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
}
