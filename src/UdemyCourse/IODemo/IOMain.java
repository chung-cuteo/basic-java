package UdemyCourse.IODemo;

import java.io.IOException;
import java.io.InputStream;

public class IOMain {
    public static void main(String[] args) {
        try {
            int ch = System.in.read();
            System.out.println((char) ch);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
