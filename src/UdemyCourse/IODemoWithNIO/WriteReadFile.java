package UdemyCourse.IODemoWithNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteReadFile {
    public static void main(String[] args) {
        String currentWorkingDirectory = System.getProperty("user.dir");
        Path path = Paths.get(currentWorkingDirectory + "/IOFolder/write-text.txt");

        String data = """
                hello line 1
                hello line 2
                hello line 3
                """;

        try {
//            Files.write(path, data.getBytes());

            List<String> lines = Files.readAllLines(path);

            for (String line: lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
