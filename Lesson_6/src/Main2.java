import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число:");
            int a = new Scanner(System.in).nextInt();
            if (a == 5) {
                System.out.println("5");
            } else if (a == 6) {
                System.out.println("6");
            } else if (a == 7) {
                System.out.println("7");
            } else {
                System.out.println("N/A");
            }
        }
    }
}
