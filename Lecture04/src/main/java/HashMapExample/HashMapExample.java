package HashMapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // Add elements
        scores.put("Park", 95);
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        System.out.println("Scores: " + scores);

        // add duplicate element
        scores.put("Park", 100); // This will update the score for Park
        System.out.println("Scores after updating Park's score: " + scores);

        // get element by key
        int parkScore = scores.get("Park");
        System.out.println("Park's score: " + parkScore);

        // check if key exists
        boolean hasKim = scores.containsKey("Kim");
        System.out.println("Does Kim exist in the scores? " + hasKim);

        // remove element by key
        scores.remove("Lee");
        System.out.println("Scores after removing Lee: " + scores);

        // iterate through the HashMap
        System.out.println("All keys: " + scores.keySet());
    }
}
