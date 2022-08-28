package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTransactions {
    public static void main(String[] args) {
        String data = "I am writing to a folder right now using BufferedOutputStream.\n";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/IO/buffered.txt", true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] array = data.getBytes();
            bufferedOutputStream.write(array);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
