import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.print("Ingresa una letra: ");
        char l = sc.next().charAt(0);

        int contador = 0;
        char lMinuscula = Character.toLowerCase(l);

        for (int i = 0; i < frase.length(); i++) {
            if (Character.toLowerCase(frase.charAt(i)) == lMinuscula) {
                contador++;
            }
        }
        System.out.println("La letra '" + l + "' aparece " + contador + " veces en la frase.");
    }
}