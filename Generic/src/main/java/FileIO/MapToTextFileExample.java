package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class MapToTextFileExample {
    public static void main(String[] args){

        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("Cherry", 30);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Stock.txt"))){
            for(Map.Entry<String, Integer> entry : stockMap.entrySet()){
                bw.write(entry.getKey()+" "+entry.getValue());
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
