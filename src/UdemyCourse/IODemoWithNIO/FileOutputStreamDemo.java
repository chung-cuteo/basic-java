package UdemyCourse.IODemoWithNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String filename = "IOFolder/random-numbers.txt";
        try {
           FileOutputStream fout = new FileOutputStream(filename);
            Random rd = new Random();
            int i = 0;
            while (i < 10) {
                int num = rd.nextInt(10);
                fout.write(num);
                i++;
            }

            System.out.println("file is wrote");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
