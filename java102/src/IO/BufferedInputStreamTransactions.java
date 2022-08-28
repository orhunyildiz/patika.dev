package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTransactions {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/IO/patika2.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedInputStream.skip(1);
            System.out.println("Bytes: " + bufferedInputStream.available());
            int i = bufferedInputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            System.out.println("\nBytes: " + bufferedInputStream.available());
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
