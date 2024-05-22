import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        double value = new Scanner(System.in).nextDouble();
        System.out.println("Введите \" + - / * \"");
        char symbol = new Scanner(System.in).nextLine();;
        System.out.println("Введите второе число: ");
        double value2 = new Scanner(System.in).nextDouble();
        if ( symbol == "+") {
            System.out.println(value + value2);
        }
    }
}
