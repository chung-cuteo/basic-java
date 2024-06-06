package UdemyCourse.OOPAdvance.Colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
       List<String> lists = new ArrayList<>();

       lists.add("chung");
       lists.add("hong");
       lists.set(1, "aaa");

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        for (String item: lists) {
            System.out.println(item);
        }

        Iterator inter = lists.iterator();

        while (inter.hasNext()) {
            System.out.println(inter.next());
        }
    }
}
