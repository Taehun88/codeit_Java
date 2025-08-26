package StreamAdvancedExample;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("one", "two", "three");
        int count = 0;

        items.stream().filter(a -> a.length() >3)
                        .peek(b -> System.out.println("[peak1]" + b))
                                .forEach(System.out::println);

        System.out.println("Count of filtered items: " + count);
    }
}