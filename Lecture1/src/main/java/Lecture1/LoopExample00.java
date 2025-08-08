package Lecture1;

public class LoopExample00 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i ++){
            System.out.println(i);
        }

        for(int i = 0; i < 6; i ++){
            System.out.println("i: " + i);
            for(int j = 0 ; j < 3; j ++){
                System.out.println("j: "+ j);
            }
        }
    }
}
