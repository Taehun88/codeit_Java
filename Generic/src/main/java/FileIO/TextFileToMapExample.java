package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class TextFileToMapExample {
    public static void main(String[] args){
        Map<String, Integer> loadMap = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader("Stock.txt"))){
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(" ");
                if(parts.length == 2){
                    String key = parts[0];
                    Integer value = Integer.parseInt(parts[1]);
                    loadMap.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(loadMap);
    }
}
