import java.util.Scanner;

public class Exercise4 {
    public static void exercise4() {
//        Задание №4
        String BinaryInput;
        int IntResult;
        System.out.println("Запуск задания 4");
        System.out.println("Введите бинарное число: ");
        Scanner in = new Scanner(System.in);
        BinaryInput = in.nextLine();
        IntResult = Integer.parseInt(BinaryInput, 2);
        System.out.println("Результат: " + IntResult);
    }
}
