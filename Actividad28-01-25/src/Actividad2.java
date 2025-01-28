import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre completo:");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Nombre en minúsculas: " + nombreCompleto.toLowerCase());

        System.out.println("Nombre en mayúsculas: " + nombreCompleto.toUpperCase());

        System.out.println("Nombre con iniciales en mayúsculas: " + capitalizar(nombreCompleto));

        scanner.close();
    }

    public static String capitalizar(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(palabra.substring(0, 1).toUpperCase())
                        .append(palabra.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return resultado.toString().trim();
    }
}