package Ejercicios3;

import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Caja Registradora");
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();
        
        System.out.print("Ingrese el dinero entregado por el cliente: ");
        double dineroEntregado = scanner.nextDouble();
        
        if (dineroEntregado < totalCompra) {
            System.out.println("El dinero entregado es insuficiente para cubrir el total de la compra.");
        } else {
            double cambio = dineroEntregado - totalCompra;
            System.out.printf("El cambio a entregar es: %.2f\n", cambio);
        }
        
        scanner.close();
    }
}