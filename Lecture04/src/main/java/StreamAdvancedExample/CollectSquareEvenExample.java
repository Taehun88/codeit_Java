package StreamAdvancedExample;

import java.util.Arrays;
import java.util.List;

public class CollectSquareEvenExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 4, 5, 10, 2);

        List<Integer> processed = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .distinct()
                .toList();

        System.out.println("Processed List: " + processed);
    }
}
