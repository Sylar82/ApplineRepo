import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise17 {
    public static void exercise17() {
        String s = "";
        File file = new File("src/main/resources/fileTwo.txt");
        Scanner in = new Scanner(System.in);


        while (!s.equals("стоп")) {
            System.out.println("Введите строку: ");
            s = in.nextLine();

            try (FileWriter writer = new FileWriter(file)) {
                writer.append(s).append("\n");
                System.out.println("Строка записана!");

            } catch (IOException e) {
                System.out.println("Файл не найден");
                e.printStackTrace();
            }
        }
    }
}
