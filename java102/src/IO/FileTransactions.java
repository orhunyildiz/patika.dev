package IO;

import java.io.File;

public class FileTransactions {
    public static void main(String[] args) {
        File file = new File("src/IO/patika.txt");

        try {
            boolean value = file.createNewFile();
            if (value)
                System.out.println("The file is created.");
            else
                System.out.println("The file already exists.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        boolean value = file.delete();
        if (value)
            System.out.println("The file is deleted.");
        else
            System.out.println("The file is not deleted.");

        File file1 = new File("src/IO/test/test2");
        value = file1.mkdirs(); // tek bir dizin oluşturmasını istiyorsak mkdir() metodu kullanılır.
        if (value)
            System.out.println("The new directory is created.");
        else
            System.out.println("The directory already exists.");

        File file2 = new File("src");
        String[] fileList = file2.list();
        for (String str : fileList)
            System.out.println(str);
    }
}
