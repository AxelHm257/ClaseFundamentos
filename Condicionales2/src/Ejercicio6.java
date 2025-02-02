import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;

        while (true) {
            System.out.println("Introduce una operación (D + cantidad (para depósito), R + cantidad (para retiro)");
            String operacion = sc.nextLine().trim();

            if (operacion.isEmpty()) {
                break;
            }

            char tipoOperacion = operacion.charAt(0);
            int cantidad = Integer.parseInt(operacion.substring(2).trim());

            if (tipoOperacion == 'D') {
                saldo += cantidad;
            } else if (tipoOperacion == 'R') {
                saldo -= cantidad;
            } else {
                System.out.println("Operación no válida.");
            }
        }

        System.out.println("Saldo final: " + saldo);
    }
}