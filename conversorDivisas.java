package monedaCalcu;

import java.util.Scanner;

public class conversorDivisas {
    public static void main(String[] args) {
        conversorDivisas conversor = new conversorDivisas();
        conversor.solicitarDatos();
    }

    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al conversor de divisas");
        System.out.println("Seleccione la conversión deseada:");
        System.out.println("1. Pesos a Quetzales");
        System.out.println("2. Pesos a Soles");
        System.out.println("3. Pesos a Dólares");
        System.out.print("Ingrese el número de la conversión que desea: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese la cantidad de Pesos: ");
        double pesos = scanner.nextDouble();
        
        switch (opcion) {
            case 1:
                conversorPesosQuetzal(pesos);
                break;
            case 2:
                conversorPesosSol(pesos);
                break;
            case 3:
                conversorPesosDolar(pesos);
                break;
            default:
                System.out.println("Opción inválida. Seleccione una opción válida del 1 al 3.");
                break;
        }

        scanner.close();
    }

    public void conversorPesosQuetzal(double pesos) {
        double quetzales = pesos * 0.046;
        System.out.println(pesos + " Pesos equivalen a " + quetzales + " Quetzales");
    }

    public void conversorPesosSol(double pesos) {
        double soles = pesos * 0.21;
        System.out.println(pesos + " Pesos equivalen a " + soles + " Soles");
    }

    public void conversorPesosDolar(double pesos) {
        double dolares = pesos * 0.058;
        System.out.println(pesos + " Pesos equivalen a " + dolares + " Dólares");
    }
}
	
	
	

