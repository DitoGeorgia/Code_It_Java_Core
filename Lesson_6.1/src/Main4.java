import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        while (true) {

            double twixPrice = 3;
            double marsPrice = 4;
            double snickersPrice = 5;
            double bonAquaPrice = 2;
            double sum = twixPrice + marsPrice + snickersPrice + bonAquaPrice;
            double sum1 = twixPrice + marsPrice + snickersPrice;
            double sum2 = twixPrice + marsPrice;
            double sum3 = twixPrice + marsPrice + bonAquaPrice;
            double sum4 = twixPrice + snickersPrice + bonAquaPrice;
            double sum5 = twixPrice + snickersPrice;
            double sum6 = twixPrice + bonAquaPrice;
            double sum7 = marsPrice + snickersPrice + bonAquaPrice;
            double sum8 = marsPrice + snickersPrice;
            double sum9 = marsPrice + bonAquaPrice;
            double sum10 = snickersPrice + bonAquaPrice;

            boolean isCanBuy = false;

            System.out.println("Введите кол-во денеж.средств: ");
            double moneyAmount = new Scanner(System.in).nextDouble();

            if (moneyAmount >= sum) {
                double s = moneyAmount - sum;
                System.out.println("Вы можете купить Твикс, Марс, Сникерс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum1) {
                double s = moneyAmount - sum1;
                System.out.println("Вы можете купить Твикс, Марс и Сникерс\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum2) {
                double s = moneyAmount - sum2;
                System.out.println("Вы можете купить Твикс и Марс\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum3) {
                double s = moneyAmount - sum3;
                System.out.println("Вы можете купить Твикс, Марс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum4) {
                double s = moneyAmount - sum4;
                System.out.println("Вы можете купить Твикс, Сникерс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum5) {
                double s = moneyAmount - sum5;
                System.out.println("Вы можете купить Твикс и Сникерс\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum6) {
                double s = moneyAmount - sum6;
                System.out.println("Вы можете купить Твикс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum7) {
                double s = moneyAmount - sum7;
                System.out.println("Вы можете купить Марс, Сникерс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum8) {
                double s = moneyAmount - sum8;
                System.out.println("Вы можете купить Марс и Сникерс \n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum9) {
                double s = moneyAmount - sum9;
                System.out.println("Вы можете купить Марс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (moneyAmount >= sum10) {
                double s = moneyAmount - sum10;
                System.out.println("Вы можете купить Сникерс и Воду\n" + "Сдача " + s + "\n");
                isCanBuy = true;
            }
            if (isCanBuy == false) {
                System.out.println("У вас не хватает средств :( ");
            }

        }
    }
}
