package IO;

import java.io.FileReader;

public class FileReaderTransactions {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/IO/patika2.txt");
            int i = fileReader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
