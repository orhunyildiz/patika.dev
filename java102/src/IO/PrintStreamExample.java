package IO;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) {
        String data = "Hello World.\n";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/IO/print.txt", true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.print(data);
            printStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
