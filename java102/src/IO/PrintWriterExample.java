package IO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        String data = "Java 102 Dersleri.\n";
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("src/IO/printWriter.txt", true));
            printWriter.print(data);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
