import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String espacio=" ", asterisco="*";
        int pisos=0;

        System.out.println("Nivel de la piramide: ");
        pisos=scanner.nextInt();

        for (int i=1; i<=pisos; i++) {
            for(int espacios=pisos-i; espacios>0; espacios--)
                System.out.print(espacio);
            for(int lineas=1; lineas<2*i; lineas++)
                System.out.print(asterisco);
            System.out.println("");
        }
    }
}