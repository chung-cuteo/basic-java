package UdemyCourse.IODemoWithNIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        String fileName = "IOFolder/dataVariable.txt";

        try(DataOutputStream data = new DataOutputStream(new FileOutputStream(fileName))) {
            String name = "chung";
            int number = 1;
            boolean isBoolean = true;
            float fl = 1.0f;

            data.writeUTF(name);
            data.writeInt(number);
            data.writeBoolean(isBoolean);
            data.writeFloat(fl);

            System.out.println("wrote success");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
