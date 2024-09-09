package Ejercicios3;

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Calcular Notas escolares de estudiantes");
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        
        double[][] notas = new double[numEstudiantes][3];
        double[] notasFinales = new double[numEstudiantes];
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese las tres notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = scanner.nextDouble();
            }
            notasFinales[i] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
            if (notasFinales[i] >= 3.0) { // Considerando 3.0 como la nota mínima para aprobar
                aprobados++;
            } else {
                reprobados++;
            }
        }
        
        System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
        System.out.println("Cantidad de estudiantes reprobados: " + reprobados);
        
        scanner.close();
    }
}