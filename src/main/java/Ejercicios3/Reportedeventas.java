package Ejercicios3;

public class Reportedeventas {
    public static void main(String[] args) {
        System.out.print("Cálculo de Estadísticas de Ventas");
        double[] ventas = {150.0, 200.5, 50.75, 300.0, 100.0, 250.25};
        
        double totalVentas = 0;
        double maxVenta = ventas[0];
        double minVenta = ventas[0];
        
        for (double venta : ventas) {
            totalVentas += venta;
            if (venta > maxVenta) {
                maxVenta = venta;
            }
            if (venta < minVenta) {
                minVenta = venta;
            }
        }
        
        double promedioVentas = totalVentas / ventas.length;
        
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas por transacción: " + promedioVentas);
        System.out.println("Transacción más alta: " + maxVenta);
        System.out.println("Transacción más baja: " + minVenta);
    }
}