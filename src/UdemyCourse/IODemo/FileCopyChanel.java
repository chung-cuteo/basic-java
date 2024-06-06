package UdemyCourse.IODemo;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileCopyChanel {
    public static void main(String[] args) {
        File source = new File("IOFolder/download.jpeg");
        File target = new File("IOFolder/download-chanel-copy.jpg");

        try {
            if(source.exists()) {
                FileChannel  sourceChanel = new FileInputStream(source).getChannel();
                FileChannel targetChanel = new FileOutputStream(target).getChannel();

                sourceChanel.transferTo(0, sourceChanel.size(), targetChanel);

            } else {
                System.out.println("not exist file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
