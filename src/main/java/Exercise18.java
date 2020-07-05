import java.io.*;
import java.util.Scanner;

public class Exercise18 {
    public static void readFile() {

        try {
            File file = new File("src/main/resources/file.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            System.out.println("Содержимое файла: ");
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countLineInFile() {
        File file = new File("src/main/resources/file.txt");
        int lineNumber = 0;

        try {

            FileReader fileReader = new FileReader(file);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            while (lineNumberReader.readLine() != null) {
                lineNumber++;
            }
            System.out.println("Количество строк в файле: " + lineNumber);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineNumber;
    }

    public static void writeFile() {
        File file = new File("src/main/resources/file.txt");
        String s;
        Scanner in = new Scanner(System.in);
        int lineNumber = countLineInFile();
        try {
            FileWriter writer = new FileWriter(file, false);
            for (int i = 1; i <= lineNumber; i++) {
                System.out.println("Введите строку №" + i + " из " + lineNumber + ": ");
                s = in.nextLine();
                writer.write(s + "\n");
                System.out.println("Строка записана!");

            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}