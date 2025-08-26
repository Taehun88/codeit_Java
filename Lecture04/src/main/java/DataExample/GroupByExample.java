package DataExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Kang", "Choi", "Cha");

        Map<Character,List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(grouped);
    }
}
