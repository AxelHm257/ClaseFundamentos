import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String ContraseñaAlmacenada = "Axel12345";

            System.out.print("Ingrese la contraseña: ");
            String contraseña = scanner.nextLine();

            if (contraseña.equalsIgnoreCase(ContraseñaAlmacenada)){
                System.out.print("Los contraseñas coinciden");
            }else if (contraseña != ContraseñaAlmacenada) {
                System.out.print("Las contraseñas no coinciden");
            }
        }
    }