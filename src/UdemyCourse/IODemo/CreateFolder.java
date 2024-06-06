package UdemyCourse.IODemo;

import java.io.File;
import java.io.IOException;

public class CreateFolder {
    public static void main(String[] args) {


        File file = new File("TestDirectory");

            if(file.mkdirs()) {
                System.out.println("created folder");
            }else {
                System.out.println("can not create folder");
            }

    }
}
