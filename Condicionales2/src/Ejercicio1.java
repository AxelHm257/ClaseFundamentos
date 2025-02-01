import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int num = sc.nextInt();

        for (int i = 1; i < num; i = i+2) {
            System.out.println(i+",");
        }
    }
}