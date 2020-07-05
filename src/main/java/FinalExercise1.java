import java.util.Scanner;

public class FinalExercise1 {
    public static void finalExercise1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите бинарное значение: ");
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        int[] IntArr = new int[arr.length];
        int result = 0;

        for (int j = 0; j < arr.length; j++) {
            IntArr[j] = Integer.parseInt(String.valueOf(arr[j]));
        }

        for (int i = 0; i < IntArr.length; i++) {
            result += IntArr[i] * Math.pow(2, ((IntArr.length - 1) - i));
        }
        System.out.println("Результат: " + result);
    }

}
