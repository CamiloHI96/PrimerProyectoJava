package GrupoKLK;

import java.util.Scanner;

public class EjerciciosM2B {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Ejecicios 2B");
            System.out.println("1. Ejercicio 2.9");
            System.out.println("2. Ejercicio 2.10");
            System.out.println("3. Ejercicio 2.11");
            System.out.println("4. Ejercicio 2.12");
            System.out.println("5. Ejercicio 2.13");
            System.out.println("6. Ejercicio 2.14");
            System.out.println("7. Ejercicio 2.15");
            System.out.println("8. Ejercicio 2.16");
            System.out.println("9. Sgts ejercicios");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios2.Fibonacci.main(args);
                    break;
                case 2:
                    Ejercicios2.FizzBuzz.main(args);
                    break;
                case 3:
                    Ejercicios2.Invertirnumero.main(args);
                    break;
                case 4:
                    Ejercicios2.MatrizIdentidad.main(args);
                    break;
                case 5:
                    Ejercicios2.Mayorymenordeunarray.main(args);
                    break;
                case 6:
                    Ejercicios2.Mcd.main(args);
                    break;
                case 7:
                    Ejercicios2.Mcm.main(args);
                    break;
                case 8:
                    Ejercicios2.Numeroperfecto.main(args);
                    break;
                case 9:
                    GrupoKLK.EjerciciosM2C.main(args);
                    break;
                case 10:
                    GrupoKLK.Menu.main(args);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
