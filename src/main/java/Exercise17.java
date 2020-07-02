import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise17 {
    public static void exercise17() {
        String s;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        s = in.nextLine();

        File file = new File("src/main/resources/fileTwo.txt");

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(s + "\n");
            System.out.println("Строка записана!");
        } catch (IOException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

    }
}
