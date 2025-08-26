package FileIO;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {

        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String content = "Hello, Buffered IO!";
            bw.write(content);
            bw.newLine();
            bw.write("This is a new line.");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
