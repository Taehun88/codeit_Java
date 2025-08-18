package FunctionalExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Hello"));

        List<String> words = Arrays.asList("Hello", "World");
        words.stream().map(lengthFunc).forEach(System.out::println);
    }
}
