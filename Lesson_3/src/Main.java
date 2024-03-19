import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\t\t\t\tКонвертор Гбайт --->>> в Мбайт\t\t\t\t");
//        System.out.println("Введите количество Гбайт: ");
//        int value = new Scanner(System.in).nextInt();
//        int value2 = 1024;
//        System.out.println(value + " Гб " + "= " + (value * value2) + " Мб");
        /**
         * BMI - калькулятор !!! масса (кг) / рост (м2)
         */
        System.out.println("\t\t\tBMI - калькулятор !!!\t\t\t");
        System.out.println("Введите вес (кг): ");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("Введите рост (метр): ");
        double height = new Scanner(System.in).nextDouble();
        double summ = (weight / (height * height)); //BMI
        double summ2 = 18.5 - summ;       // Недостаточный BMI
        double summ3 = summ - 24.9;       // Избыточный BMI
        double summ4 = summ - 29.9;       // Ожирение BMI
        double weight2 = summ2 * weight / summ; // Пропорция:  3.1 * 55 / 15.4  если 15,4 - 55 кг  тогда  3,1 - 11,1
        double weight21 = weight2 + 1;
        double weight3 = summ3 * weight / summ;
        double weight31 = weight3 + 1;
        double weight4 = summ4 * weight / summ;
        double weight41 = weight4 + 1;
        if (summ < 18.5) {
            System.out.printf("BMI - " + "%.1f" + "  менее 18,5" + "\nНедостаточный BMI: " + "%.1f" + "\nНедостаточный Вес: ~ " + "%.0f" + "-%.0f" + " кг",summ,summ2,weight2,weight21);
        } else if (summ >= 18.5 && summ < 24.9) {
            System.out.printf("BMI - " + "%.1f" + "  Нормальный BMI от 18,5 до 24,9" + "\nИзбыточный Вес: 0 кг"  ,summ);
        } else if (summ >= 24.9 && summ < 29.9) {
            System.out.printf("BMI - " + "%.1f" + "  от 24,9 до 29,9 избыточный"+ "\nИзбыточный BMI: " + "%.1f" + "\nИзбыточный Вес: " + "%.0f" + "-%.0f" + " кг",summ,summ3,weight3,weight31);
        } else {
            System.out.printf("BMI - " + "%.1f" + "  от 29,9 и выше ожирение"+ "\nИзбыточный BMI: " + "%.1f" + "\nИзбыточный Вес: " + "%.0f" + "-%.0f" + " кг" + "\tСтадия \"Ожирения\"",summ,summ4,weight4,weight41);
        }
    }
}