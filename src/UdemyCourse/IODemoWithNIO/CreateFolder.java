package UdemyCourse.IODemoWithNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder {
    public static void main(String[] args) {
        Path path = Paths.get("IOFolder");
        try {
            boolean isExist = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            if(isExist) throw new IOException("File is exits");

            Files.createDirectory(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
