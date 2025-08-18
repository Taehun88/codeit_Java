package StreamBasicExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMapExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        scores.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}
