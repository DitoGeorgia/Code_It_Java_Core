import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        while (true) {

            double twixPrice = 2.7;
            double marsPrice = 3.5;
            double snickersPrice = 3.9;
            double bonAquaPrice = 1.5;

            System.out.println("Введите кол-во денеж.средств: ");
            double moneyAmount = new Scanner(System.in).nextDouble();

            if (moneyAmount >= twixPrice) {
                System.out.println("Вы можете купить Твикс");
            }
            if (moneyAmount >= marsPrice) {
                System.out.println("Вы можете купить Марс");
            }
            if (moneyAmount >= snickersPrice) {
                System.out.println("Вы можете купить Сникерс");
            }
            if (moneyAmount >= bonAquaPrice) {
                System.out.println("Вы можете купить Воду");
            }

        }
    }
}