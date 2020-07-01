import java.util.Scanner;

public class Exercise7 {
    public static void exercise7() {
        final int x = 1;
        final int y = 2;
        final int z = 3;
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = in.nextInt();

        switch (number) {
            case x:
            case y:
            case z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }
    }
}
