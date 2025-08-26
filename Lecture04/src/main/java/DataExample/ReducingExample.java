package DataExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Collector");

        String joining = words.stream().reduce
                ("", (a, b) -> a.isEmpty() ? b : a + " - " + b);

        System.out.println(joining);
    }
}
