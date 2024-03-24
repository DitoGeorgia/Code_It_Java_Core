import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите температуру по Цельсию \"С\" : ");
            double tempC = new Scanner(System.in).nextDouble();
//        double tempF = tempC * 1.8 + 32;
//        System.out.println("Температура по Фаренгейту \"F\":\n" + tempF);
            System.out.println("Температура по Фаренгейту \"F\" : " + (tempC * 1.8 + 32)+ "\n");
        }
    }
}

