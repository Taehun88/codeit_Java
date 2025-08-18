package FunctionalExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(11));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .filter(isEven)
                .forEach(System.out::println);
    }
}
