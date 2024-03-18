import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t\tКонвертор Гбайт --->>> в Мбайт\t\t\t\t");
        System.out.println("Введите количество Гбайт: ");
        int value = new Scanner(System.in).nextInt();
        int value2 = 1024;
        System.out.println(value + " Гб " + "= " + (value * value2) + " Мб");
    }
}
