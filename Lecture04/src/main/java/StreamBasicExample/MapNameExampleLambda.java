package StreamBasicExample;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNameExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, Integer> nameLength = String::length;

        names.stream()
                .map(nameLength)
                .forEach(length -> System.out.println("이름 길이: " + length));
    }
}
