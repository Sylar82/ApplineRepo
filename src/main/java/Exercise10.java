import java.util.Arrays;
import java.util.Scanner;

public class Exercise10 {
    public static void exercise10() {
        int matrixWidth;
        int matrixHeight;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину матрицы: ");
        matrixWidth = in.nextInt();
        System.out.println("Введите высоту матрицы: ");
        matrixHeight = in.nextInt();

        int[][] matrix = new int[matrixHeight][matrixWidth];

        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                System.out.println("Введите значение " + i + ", " + j + " элемента матрицы");
                matrix[i][j] = in.nextInt();
                if (i == 0) {
                    matrix[0][j] *= 3;
                }
            }

        }
        System.out.println("Полученная первая строка матрицы: " + Arrays.toString(matrix[0]));
    }
}
