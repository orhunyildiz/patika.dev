package IO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTransactions {
    public static void main(String[] args) {
        String data = "Türkçe karakterler: ç,ğ,ı,İ,ö,ş,ü";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/IO/outputStreamWriter.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
