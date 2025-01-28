import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese la frase");
        String frase = scn.nextLine();
        StringBuilder sb = new StringBuilder(frase);

        System.out.println(sb.reverse().toString());
    }
}