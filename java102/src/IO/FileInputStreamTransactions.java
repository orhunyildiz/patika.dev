package IO;

import java.io.FileInputStream;

public class FileInputStreamTransactions {
    public static void main(String[] args) {

        // FileInputStream ile okuma.
        try {
            FileInputStream inputStream = new FileInputStream("src/IO/patika2.txt");
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // available()
        try {
            FileInputStream inputStream = new FileInputStream("src/IO/patika2.txt");
            System.out.println("Kullanılabilir byte sayısı: " + inputStream.available());
            inputStream.read();
            inputStream.read();
            inputStream.read();
            System.out.println("Kullanılabilir byte sayısı: " + inputStream.available());
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // skip()
        try {
            FileInputStream inputStream = new FileInputStream("src/IO/patika2.txt");
            inputStream.skip(5);
            System.out.println("5 bytelık veri atlandı: ");
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
