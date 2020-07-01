import java.util.Scanner;

public class Exercise13 {
    public static void exercise13() {
        String firstString, secondString;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        firstString = in.nextLine();

        System.out.println("Введите вторую стоку: ");
        secondString = in.nextLine();

        if (firstString.length() > secondString.length()) {
            System.out.println("Наиболее длинная строка: " + firstString);
        } else if (firstString.length() == secondString.length()) {
            System.out.println("Обе строки равны");
        } else {
            System.out.println("Наиболее длинная строка: " + secondString);
        }

    }
}
