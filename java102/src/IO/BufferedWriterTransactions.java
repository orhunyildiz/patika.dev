package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTransactions {
    public static void main(String[] args) {
        String data = "Java 102 Dersleri\n";
        try {
            FileWriter fileWriter = new FileWriter("src/IO/bufferedWriter.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
