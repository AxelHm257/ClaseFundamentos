import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();

        if (edad < 4) {
            System.out.println("Entra Gratis");
        }else if (edad > 4 && edad < 18 ) {
            System.out.println("Paga $110");
        }else if (edad > 18) {
            System.out.println("Paga $190");
        }
    }
}
