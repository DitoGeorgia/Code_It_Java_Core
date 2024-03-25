import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите сумму: ");
            int sum = new Scanner(System.in).nextInt();
            double sum2 = sum * 34.13;
            double sum3 =  sum * 0.37;
            double sum4 = sum * 0.34;
            System.out.printf(sum + " ₾(GEL) - " + "%.1f" + " ₽(RUB)" +"\n",sum2 );
            System.out.printf(sum + " ₾(GEL) - " + "%.1f" + " $(USD)" +"\n",sum3 );
            System.out.printf(sum + " ₾(GEL) - " + "%.1f" + " €(EUR)" +"\n",sum4 );
        }
    }
}
