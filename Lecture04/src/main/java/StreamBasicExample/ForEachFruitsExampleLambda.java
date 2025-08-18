package StreamBasicExample;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachFruitsExampleLambda {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        fruits.stream()
                .map(fruit -> "Fruit: " + fruit)
                .forEach(System.out::println);
    }
}
