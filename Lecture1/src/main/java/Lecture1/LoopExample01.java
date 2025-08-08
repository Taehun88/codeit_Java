package Lecture1;

public class LoopExample01 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < nums.length; i++) {
            System.out.println("인덱스: " + i + ", 값: " + nums[i]);
        }
        System.out.println("=====================================");
        for(int num : nums) {
            System.out.println("값: " + num);
        }
    }
}
