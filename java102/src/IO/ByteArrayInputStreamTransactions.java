package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTransactions {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        System.out.println("Available bytes at the beginning: " + byteArrayInputStream.available());
        System.out.println("The bytes read from the input stream: ");
        byteArrayInputStream.skip(2);
        for (int i = 0; i < array.length - 2; i++) {
            int data = byteArrayInputStream.read();
            System.out.print(data + ", ");
        }
        System.out.println("Available bytes at the beginning: " + byteArrayInputStream.available());
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
