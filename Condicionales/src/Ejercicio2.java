import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es entero");
        } else {
            System.out.println("El número es impar");
        }
    }
}