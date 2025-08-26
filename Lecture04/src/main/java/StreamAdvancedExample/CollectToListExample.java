package StreamAdvancedExample;

import java.util.Arrays;
import java.util.List;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "b");

        List<String> result = data.stream().distinct().toList();

        System.out.println(result);
    }
}
