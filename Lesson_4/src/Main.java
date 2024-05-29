import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\t\tКалькулятор!!!\t\n");
            System.out.print("Введите первое число: ");
            double value = new Scanner(System.in).nextInt();
            System.out.print("Введите второе число: ");
            double value2 = new Scanner(System.in).nextInt();
            System.out.println(value+" + "+value2+" = "+(value+value2));
            System.out.println(value+" - "+value2+" = "+(value-value2));
            System.out.println(value+" * "+value2+" = "+(value*value2));
            System.out.println(value+" / "+value2+" = "+(value/value2));
        }
    }
}
