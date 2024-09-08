package Ejercicios2;

import java.util.Scanner;

public class MatrizIdentidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Impresion de Matriz Identidad");
        System.out.print("Ingrese el tamaño de la matriz identidad: ");
        int n = scanner.nextInt();
        
        int[][] matrizIdentidad = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            matrizIdentidad[i][i] = 1;
        }
        
        System.out.println("Matriz identidad de tamaño " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
