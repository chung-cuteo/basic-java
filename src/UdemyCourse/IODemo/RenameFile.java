package UdemyCourse.IODemo;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("hello.txt");
        File newFile = new File("hello1.txt");

        if(oldFile.exists()) {
            boolean rename = oldFile.renameTo(newFile);
            if(rename) {
                System.out.println("rename success");
            } else  {
                System.out.println("can not rename");
            }
        }
    }
}
