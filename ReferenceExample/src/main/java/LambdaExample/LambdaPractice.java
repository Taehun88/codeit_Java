package LambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> print = name -> System.out.println(name);
        names.forEach(print);

        Predicate<String> lengthCheck = name -> name.length() >= 5;
        names.stream().filter(lengthCheck).forEach(System.out::println);

        Function<String, String> upperCase = name -> name.toUpperCase();
        names.stream().map(upperCase).forEach(System.out::println);
    }
}
