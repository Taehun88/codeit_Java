package StreamAdvancedExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Cat", "Dog"),
                Arrays.asList("Egg")
        );

        List<String> flattened = nestedList.stream().flatMap(Collection::stream).toList();

        System.out.println("Flattened list: " + flattened);
    }
}
