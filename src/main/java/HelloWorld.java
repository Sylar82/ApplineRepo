
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
     //   System.out.print("Hello World!");
         String BinaryInput;
         int IntResult = 0;

//      Задание №4
//        System.out.println("Введите бинарное число: ");
//        Scanner in = new Scanner(System.in);
//        BinaryInput = in.nextLine();
//        IntResult = Integer.parseInt(BinaryInput, 2);
//        System.out.println("Результат: " + IntResult);

//      Задание №5
        int NumberInput;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        NumberInput = in.nextInt();
        System.out.println("Результат:  \n"
                + NumberInput + " x 1 = " + NumberInput + "\n" +
                + NumberInput + " x 2 = " + NumberInput*2 + "\n" +
                + NumberInput + " x 3 = " + NumberInput*3 + "\n" +
                + NumberInput + " x 4 = " + NumberInput*4 + "\n" +
                + NumberInput + " x 5 = " + NumberInput*5 + "\n" +
                + NumberInput + " x 6 = " + NumberInput*6 + "\n" +
                + NumberInput + " x 7 = " + NumberInput*7 + "\n" +
                + NumberInput + " x 8 = " + NumberInput*8 + "\n" +
                + NumberInput + " x 9 = " + NumberInput*9 + "\n" +
                + NumberInput + " x 10 = " + NumberInput*10 + "\n"
                );


    }
}
