import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {
    public static void exercise15() {

        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значение " + i + " массива");
            array[i] = in.nextInt();
        }

        System.out.println("Неотсортированный массив: " + Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(array));

    }

}