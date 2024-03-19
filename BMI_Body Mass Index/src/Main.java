import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\t\t\t\tКонвертор Гбайт --->>> в Мбайт\t\t\t\t");
//        System.out.println("Введите количество Гбайт: ");
//        int value = new Scanner(System.in).nextInt();
//        int value2 = 1024;
//        System.out.println(value + " Гб " + "= " + (value * value2) + " Мб");
        /**
         * BMI - კალკულატორი !!! მასა (კგ) / სიმაღლე (მ2)
         * BMI სხეულის მასის ინდექსი (Body Mass Index)
         */
        System.out.println("\t\t\tBMI - კალკულატორი !!!\t\t\t");
        System.out.println("თქვენი წონა (კგ): ");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("თქვენი სიმაღლე(სმ): ");
        double height = new Scanner(System.in).nextDouble();
        double summ = (weight / (height * height));
        if ( summ < 18.5) {
            System.out.println("თქვენი BMI - " + summ + " კგ" + "\nსიგამხდრე: " + (18.5 - summ) + " კგ" + "\nBMI  18.5-ზე ნაკლები");
        } else if ( summ >= 18.5 && summ < 24.9 ) {
            System.out.println("თქვენი BMI " + summ + " კგ" + "\nნორმალური წონა \nBMI 18.5-დან 24.9-მდე");
        } else if ( summ >= 24.9 && summ < 29.9 ) {
            System.out.println("თქვენი BMI - " + summ + " კგ" + "\nზედმეტი წონა: " + (summ - 24.9 ) + " კგ" + "\nBMI 24.9-დან 29.9-მდე");
        } else {
            System.out.println("თქვენი BMI - " + summ + " კგ" + "\nსიმსუქნე: " + (summ - 29.9 ) + " კგ" + "\nBMI 29.9-ზე მეტი");
        }
    }
}
