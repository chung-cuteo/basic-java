package UdemyCourse.IODemo;

import java.io.File;

public class ReadHardDisk {
    public static void main(String[] args) {
        File[] drivers = File.listRoots();

        for (File driver: drivers) {
            System.out.println(driver);
            System.out.println(driver.getFreeSpace());
            System.out.println(driver.getTotalSpace());
        }
    }
}
