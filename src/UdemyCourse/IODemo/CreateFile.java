package UdemyCourse.IODemo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            File file = new File("hello.txt");
            if(file.createNewFile()) {
                System.out.println("created file");
            } else  {
                System.out.println("can not create file");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
