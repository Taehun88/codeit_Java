package StreamBasicExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Consumer<Map.Entry<String, Integer>> printEntry = new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> stringIntegerEntry) {
                System.out.println("Key: " +  stringIntegerEntry.getKey() + " Value: " + stringIntegerEntry.getValue());
            }
        };

        scores.entrySet().forEach(printEntry);
    }
}
