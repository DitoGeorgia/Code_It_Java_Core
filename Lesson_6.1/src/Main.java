import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double twixPrice = 2.7;
        double marsPrice = 2.5;
        double snickersPrice = 1.9;
        double bonAquaPrice = 1.5;

        System.out.println("Введите кол-во денеж.средств: ");
        double moneyAmount = new Scanner(System.in).nextDouble();

        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить Твикс");
        } else if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить Марс");
        } else if (moneyAmount >= snickersPrice) {
            System.out.println("Вы можете купить Сникерс");
        } else if (moneyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить Воду");
        } else {
            System.out.println("У вас не хватает средств :( ");
        }
    }
}
