import java.util.Scanner;

public class Exercise6 {
    public static void exercise6() {
        System.out.println("Запуск задания 6");
        int x;
        int y;
        int z;
        int result;


        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        x = in.nextInt();
        System.out.println("Введите второе число: ");
        y = in.nextInt();
        System.out.println("Введите третье число: ");
        z = in.nextInt();

        result = ((x + y + z) / 3);
        System.out.println("Среднее арифметическое равно: " + result);

        if (result / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
