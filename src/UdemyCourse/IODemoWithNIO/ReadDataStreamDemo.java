package UdemyCourse.IODemoWithNIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataStreamDemo {
    public static void main(String[] args) {
        String fileName = "IOFolder/dataVariable.txt";

        try(DataInputStream data = new DataInputStream(new FileInputStream(fileName))) {

           String name =  data.readUTF();
           int number =  data.readInt();
           boolean isBoolean =  data.readBoolean();
          float fl =   data.readFloat();

            System.out.println("name::: " + name);
            System.out.println("number::: " + number);
            System.out.println("isBoolean::: " + isBoolean);
            System.out.println("fl::: " + fl);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
