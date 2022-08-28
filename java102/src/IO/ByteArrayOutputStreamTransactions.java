package IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTransactions {
    public static void main(String[] args) {
        String data = "Patika ile Java Öğreniyorum";

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] array = data.getBytes();
        try {
            byteArrayOutputStream.write(array);
            String streamData = byteArrayOutputStream.toString();
            System.out.println("Çıkış akışı: " + streamData);
            byteArrayOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
