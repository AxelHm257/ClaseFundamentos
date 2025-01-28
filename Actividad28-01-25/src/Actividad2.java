import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Ingrese su nombre completo");
        String nombrecompleto= scn.nextLine();

        System.out.println(nombrecompleto);
        System.out.println(nombrecompleto.toLowerCase());
        System.out.println(nombrecompleto.toUpperCase());
    }
}
