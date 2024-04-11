import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {

            double twixPrice = 2.7;
            double marsPrice = 3.5;
            double snickersPrice = 4.9;
            double bonAquaPrice = 1.5;

            boolean isCanBuy = false;

            System.out.println("Введите кол-во денеж.средств: ");
            double moneyAmount = new Scanner(System.in).nextDouble();

            if (moneyAmount >= twixPrice) {
                System.out.println("Вы можете купить Твикс");
                isCanBuy = true;
            }
            if (moneyAmount >= marsPrice) {
                System.out.println("Вы можете купить Марс");
                isCanBuy = true;
            }
            if (moneyAmount >= snickersPrice) {
                System.out.println("Вы можете купить Сникерс");
                isCanBuy =true;
            }
            if (moneyAmount >= bonAquaPrice) {
                System.out.println("Вы можете купить Воду");
                isCanBuy = true;
            }
            if (isCanBuy == false) {
                System.out.println("У вас не хватает средств :( ");
            }
        }
    }
}

