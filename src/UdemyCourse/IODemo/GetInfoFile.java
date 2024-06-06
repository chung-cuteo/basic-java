package UdemyCourse.IODemo;

import java.io.File;
import java.io.IOException;

public class GetInfoFile {
    public static void main(String[] args) {
        try {
            File file = new File("hello1.txt");

            boolean isExist = file.exists();
            File  pathAbsolute = file.getAbsoluteFile();
            long size = file.length();

            System.out.println("isExist" + isExist);
            System.out.println("pathAbsolute" + pathAbsolute);
            System.out.println("size" + size);


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
