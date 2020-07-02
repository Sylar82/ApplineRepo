import java.util.Scanner;

public class Exercise14 {
    public static void exercise14() {
        String S;
        int X;
        double Z;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        S = in.nextLine();

        X = Integer.parseInt(S);
        Z = X;

        System.out.println("String: " + S + "\n" +
                "Integer: " + X + "\n" +
                "Double: " + Z);
    }
}
