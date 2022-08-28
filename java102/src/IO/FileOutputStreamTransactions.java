package IO;

import java.io.FileOutputStream;

public class FileOutputStreamTransactions {
    public static void main(String[] args) {
        String data = "\nEğitmen: Mahmut Mustafa Çetindağ";
        try {
            FileOutputStream outputStream = new FileOutputStream("src/IO/patika2.txt", true);
            byte[] byteArray = data.getBytes();
            outputStream.write(byteArray);
            outputStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
