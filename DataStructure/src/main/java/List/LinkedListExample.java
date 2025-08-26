package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
