package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MapToCsvExample {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("stock.csv"))){
            bw.write("key,value");
            bw.newLine();

            for(Map.Entry<String, Integer> entry : stockMap.entrySet()){
                String key = entry.getKey();
                int value = entry.getValue();

                if(key.contains(",") || key.contains("\"") || key.contains("\n")){
                    key = key.replace("\"", "\"\"");
                    key = "\"" + key + "\"";
                }

                bw.write(key + "," + value);
                bw.newLine();
            }
            bw.flush();
            System.out.println("Map이 CSV 파일로 저장되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
