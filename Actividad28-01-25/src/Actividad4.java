import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Ingrese su nombre completo");
        String nombrecompleto= scn.nextLine();
        String resultado = nombrecompleto.replaceAll(" ","").toUpperCase();

        System.out.println(nombrecompleto.toUpperCase());
        System.out.println(resultado.length());
    }
}
