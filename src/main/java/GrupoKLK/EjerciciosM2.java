package GrupoKLK;

import java.util.Scanner;

public class EjerciciosM2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Ejecicios 2A");
            System.out.println("1. Ejercicio 2.1");
            System.out.println("2. Ejercicio 2.2");
            System.out.println("3. Ejercicio 2.3");
            System.out.println("4. Ejercicio 2.4");
            System.out.println("5. Ejercicio 2.5");
            System.out.println("6. Ejercicio 2.6");
            System.out.println("7. Ejercicio 2.7");
            System.out.println("8. Ejercicio 2.8");
            System.out.println("9. Sgts ejercicios");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios2.Adivinarelnumero.main(args);
                    break;
                case 2:
                    Ejercicios2.CalculadoraBasica.main(args);
                    break;
                case 3:
                    Ejercicios2.Contadorpositivosynegativos.main(args);
                    break;
                case 4:
                    Ejercicios2.Contadorvocales.main(args);
                    break;
                case 5:
                    Ejercicios2.Contardigitos.main(args);
                    break;
                case 6:
                    Ejercicios2.Conteodepalabrasenfrase.main(args);
                    break;
                case 7:
                    Ejercicios2.Convertirtemperatura.main(args);
                    break;
                case 8:
                    Ejercicios2.Factorial.main(args);
                    break;
                case 9:
                    GrupoKLK.EjerciciosM2B.main(args);
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
