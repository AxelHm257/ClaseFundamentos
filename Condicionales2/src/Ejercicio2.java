import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = numero; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}