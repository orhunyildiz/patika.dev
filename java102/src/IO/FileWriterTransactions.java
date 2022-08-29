package IO;

import java.io.FileWriter;

public class FileWriterTransactions {
    public static void main(String[] args) {
        String data = "Patika Java 102 Öğreniyorum.\n";
        try {
            FileWriter fileWriter = new FileWriter("src/IO/fileWriter.txt", true);
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
