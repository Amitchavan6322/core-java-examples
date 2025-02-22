package oldFashioned;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.File;

public class FileReaderDemo {

    private static final String FILE_PATH = "C:\\Users\\Admin\\Downloads\\fileDemo";
    private static final String FILE_NAME = "text.txt";

    public static void main(String[] args) {
        // Using try-with-resources to auto-close resources
        try (BufferedReader buffer = new BufferedReader(new FileReader(FILE_PATH + File.separator + FILE_NAME))) {
            System.out.println("--------------- started reading file -------------------");
            String strCurrentLine;
            while ((strCurrentLine = buffer.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
            System.out.println("------------ end of reading file ------------");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
