import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas");
        int horastrabajadas= scn.nextInt();

        System.out.println("Ingrese el coste por horas trabajadas");
        double costeporhora= scn.nextInt();

        double pago = horastrabajadas * costeporhora;
        System.out.println(pago);
    }
}