package GrupoKLK;

import java.util.Scanner;

public class EjerciciosM2C {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Ejecicios 2B");
            System.out.println("1. Ejercicio 2.17");
            System.out.println("2. Ejercicio 2.18");
            System.out.println("3. Ejercicio 2.19");
            System.out.println("4. Ejercicio 2.20");
            System.out.println("5. Ejercicio 2.21");
            System.out.println("6. Ejercicio 2.22");
            System.out.println("7. Ejercicio 2.23");
            System.out.println("8. Ejercicio 2.24");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios2.Numeroprimo.main(args);
                    break;
                case 2:
                    Ejercicios2.Numerospares.main(args);
                    break;
                case 3:
                    Ejercicios2.Ordenartresnumeros.main(args);
                    break;
                case 4:
                    Ejercicios2.Piramide.main(args);
                    break;
                case 5:
                    Ejercicios2.Sumadenumeros.main(args);
                    break;
                case 6:
                    Ejercicios2.Sumadigitos.main(args);
                    break;
                case 7:
                    Ejercicios2.Sumaparesyimpares.main(args);
                    break;
                case 8:
                    Ejercicios2.Tablamultiplicar.main(args);
                    break;
                case 9:
                    GrupoKLK.Menu.main(args);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
