package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTransactions {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/IO/patika2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
