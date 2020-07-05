import java.util.Arrays;
import java.util.Scanner;

public class FinalExercise2 {
    public static void finalExercise2() {


        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значение " + i + " массива");
            array[i] = in.nextInt();
        }
        System.out.println("Было");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, (arraySize - 1));

        System.out.println("Стало");
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;


                if (low < j)
                    quickSort(array, low, j);

                if (high > i)
                    quickSort(array, i, high);
            }
        }

    }

}