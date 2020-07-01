import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void exercise9() {

        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        int[] Array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значение " + i + " массива");
            Array[i] = in.nextInt() * 2;
        }

        System.out.println("Полученный массив: " + Arrays.toString(Array));


    }
}
