package Lecture1.While;

public class DoWhileExample {
    public static void main(String[] args) {
        int count = 5;

        while(count < 5) {
            System.out.println("count: " + count);
            count++;
        }
        do {
            System.out.println("count: " + count);
            count++;
        } while (count < 5);
    }
}
