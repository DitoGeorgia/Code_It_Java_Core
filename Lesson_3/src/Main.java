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
        double summ = (weight / (height * height));
        if ( summ < 18.5) {
            System.out.printf("BMI  - " + ("%f%n" + summ) + " менее 18,5" + "\nНедостаточный BMI: " + (18.5 - summ) );
        } else if ( summ >= 18.5 && summ < 24.9 ) {
            System.out.println("BMI " + summ + "\nНормальный BMI \nBMI от 18,5 до 24,9");
        } else if ( summ >= 24.9 && summ < 29.9 ) {
            System.out.println("BMI - " + summ + "\nИзбыточный BMI: " + (summ - 24.9 ) + "\nBMI от 24,9 до 29,9");
        } else {
            System.out.println("BMI - " + summ + "\nОжирение BMI: " + (summ - 29.9 ) + "\nBMI от 29,9 и выше");
        }
    }
}
