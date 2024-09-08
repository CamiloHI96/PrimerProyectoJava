import java.util.Scanner;

public class Invertirnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Invertir Numero");
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("El número invertido es: " + invertido);
    }