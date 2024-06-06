package UdemyCourse.OOPAdvance.Colections;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Thêm các phần tử vào Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Phần tử trùng lặp, sẽ không được thêm

        // Duyệt và in các phần tử trong Set
        for (String element : set) {
            System.out.println(element);
        }
    }
}
