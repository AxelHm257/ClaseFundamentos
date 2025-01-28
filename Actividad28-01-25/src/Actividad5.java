import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        final int PESOPAYASO = 112;
        final int PESOMUNECA = 75;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de payasos: ");
        int cantidadPayasos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de muñecas: ");
        int cantidadMunecas = scanner.nextInt();

        int pesoTotal = (cantidadPayasos * PESOPAYASO) + (cantidadMunecas * PESOMUNECA);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");

        scanner.close();
    }
}