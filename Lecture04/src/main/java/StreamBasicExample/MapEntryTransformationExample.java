package StreamBasicExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        // 학생별 점수를 저장한 해시맵
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Function<Map.Entry<String, Integer>, String> entryToString = new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue();
            }
        };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(System.out::println);
    }
}
