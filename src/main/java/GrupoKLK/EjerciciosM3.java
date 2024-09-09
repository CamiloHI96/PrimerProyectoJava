package GrupoKLK;

import java.util.Scanner;

public class EjerciciosM3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. CajaRegistradora");
            System.out.println("2. Reporte de ventas");
            System.out.println("3. Sistema Escolar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios3.CajaRegistradora.main(args);
                    break;
                case 2:
                    Ejercicios3.Reportedeventas.main(args);
                    break;
                case 3:
                    Ejercicios3.SistemaEscolar.main(args);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
