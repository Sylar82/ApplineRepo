import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FinalExercise3 {
    public static void finalExercise3() {
        double rubInput;
        double exchangeRate;
        double result;

        Scanner in = new Scanner(System.in);

        System.out.println("Рубли: ");
        rubInput = in.nextDouble();

        System.out.println("Введите текущий курс валют: ");
        exchangeRate = in.nextDouble();
        result = (rubInput / exchangeRate);
        BigDecimal result1 = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Доллары: " + result1);


    }
}
