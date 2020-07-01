
import java.util.Scanner;

public class Exercise12 {
    public static void exercise12() {
        String stringInput;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        stringInput = in.nextLine();

        System.out.println("Вы ввели: " + stringInput.replace(" ", ""));

    }
}
