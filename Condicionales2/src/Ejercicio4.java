import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int altura = scanner.nextInt();

        int num = 1;
        for (int i = 1; num <= altura; i++) {
            int tempNum = 1;
            for (int j = 1; j <= i && tempNum <= altura; j++) {
                System.out.print(tempNum);
                tempNum += 2;
            }
            System.out.println();
            num += 2;
        }

    }
}