package UdemyCourse.IODemoWithNIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        String filename = "IOFolder/random-numbers2.txt";
        try ( FileInputStream found = new FileInputStream(filename)) {

            int num;
            while ((num = found.read()) !=-1) {
                System.out.println(num);
            }

            System.out.println("read finished");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
