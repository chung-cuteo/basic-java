package UdemyCourse.IODemo;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        File source = new File("IOFolder/download.jpeg");
        File target = new File("IOFolder/download-copy.jpg");

        try {
            if(source.exists()) {
                BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(target));

                int data;
              while ((data = bin.read()) !=-1) {
                  bout.write(data);
              }

            } else {
                System.out.println("not exist file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
