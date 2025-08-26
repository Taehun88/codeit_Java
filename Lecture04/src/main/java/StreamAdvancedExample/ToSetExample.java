package StreamAdvancedExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "Cherry", "banana");
        Set<String> fruitsSet = fruits.stream().collect(Collectors.toSet());

        System.out.println(fruitsSet);
    }
}
