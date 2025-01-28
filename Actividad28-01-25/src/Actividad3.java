import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero= scn.nextInt();
        int suma = 0;

        for (int i = 0;i <= numero; i++){
            suma +=i;

            System.out.println(suma);
        }

    }
}