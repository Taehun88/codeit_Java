package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("a"); // Duplicate, will not be added

        System.out.println(set.contains("a"));
        System.out.println(set.size());
    }
}
