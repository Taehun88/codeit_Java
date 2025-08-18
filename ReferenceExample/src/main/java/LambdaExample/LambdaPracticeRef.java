package LambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPracticeRef {
    public static boolean isOverFive(String name) {
        return name.length() >= 5;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> print = System.out::println;
        names.forEach(print);

        Predicate<String> lengthCheck = LambdaPracticeRef::isOverFive;
        names.stream().filter(lengthCheck).forEach(System.out::println);

        Function<String, String> upperCase = String::toUpperCase;
        names.stream().map(upperCase).forEach(System.out::println);
    }
}
