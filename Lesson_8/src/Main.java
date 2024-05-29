import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[25];
        for (int i = 0; i < people.length; i++) {
            people[i] = 20 + new Random().nextInt(80);
        }
        int summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }
        System.out.println("Средний возраст: " + summ / people.length);
    }
}
