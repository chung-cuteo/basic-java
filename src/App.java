import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        // Khởi tạo một ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        // Khởi tạo một LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

//        // Truy cập một phần tử theo chỉ số
        long startTime = System.nanoTime();
        int element1 = arrayList.get(500000);
        long endTime = System.nanoTime();
        System.out.println("Truy cập một phần tử trong ArrayList: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        int element2 = linkedList.get(500000);
        endTime = System.nanoTime();
        System.out.println("Truy cập một phần tử trong LinkedList: " + (endTime - startTime) + " nanoseconds");

        // Thêm phần tử vào cuối danh sách
        startTime = System.nanoTime();
        arrayList.add(100000);
        endTime = System.nanoTime();
        System.out.println("Thêm phần tử vào cuối ArrayList: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        linkedList.add(100000);
        endTime = System.nanoTime();
        System.out.println("Thêm phần tử vào cuối LinkedList: " + (endTime - startTime) + " nanoseconds");
//
        // Xoá phần tử từ đầu danh sách
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Xoá phần tử từ đầu ArrayList: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        linkedList.removeFirst();
        endTime = System.nanoTime();
        System.out.println("Xoá phần tử từ đầu LinkedList: " + (endTime - startTime) + " nanoseconds");
    }
}
