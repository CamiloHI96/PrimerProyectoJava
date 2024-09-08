package Ejercicios2;

public class Contadorpositivosynegativos {
    public static void main(String[] args) {
        System.out.println("Contador de numeros positivos y negativos");
        int[] numeros = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        
        int positivos = 0;
        int negativos = 0;
        
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}