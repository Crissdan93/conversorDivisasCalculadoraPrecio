package precio;

import java.util.Scanner;

public class precioIva1 {
	
	
	double preciototal;
	double descuentodiez;
	
	
	public static void main(String[] args) {
		
		precioIva1 descuento = new precioIva1();
		descuento.solicitarDatos();
		
	}
	
	public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bienvenido al calculo de su precio y descuento");
        
        System.out.println("Ingrese el valor de su precio");
        double precio = scanner.nextDouble();
        
        
        precioIva2 calculadora = new precioIva2();
        
        double precioConIVA = calculadora.calculoDescuento(precio);
        
 System.out.println("Precio con IVA incluido: " + precioConIVA);
        
        scanner.close();
        
        if (precioConIVA > 50) {
			System.out.println("Se aplica un descuento de 10%");
			descuentodiez = precioConIVA * (1 - 0.10);
			System.out.println("Precio con descuento del 10%: " + descuentodiez);
		} else {
			System.out.println("Se aplica un descuento de 5%");
			double descuentocinco = precioConIVA * (1 - 0.05);
			System.out.println("Precio con descuento del 5%: " + descuentocinco);
		}
		
		scanner.close();
	}
}