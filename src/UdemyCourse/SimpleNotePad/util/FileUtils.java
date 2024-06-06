package UdemyCourse.SimpleNotePad.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtils {
    public static void save(String filename, String data) throws IOException{
        try (FileWriter fw = new FileWriter(filename, Charset.forName("UTF8"))) {
            fw.write(data);
        } 
    }
    
    public static String open(String filename) throws IOException{
        try(FileReader fr = new FileReader(filename, 
                Charset.forName("UTF8"))){
            StringBuilder sb = new StringBuilder();
            char buffer[] = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1){
                sb.append(new String(buffer, 0, len));
            }
            
            return sb.toString();
        }
    }
}
