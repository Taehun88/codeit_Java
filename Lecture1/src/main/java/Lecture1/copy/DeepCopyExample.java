package Lecture1.copy;

public class DeepCopyExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        copy[0] = 100;

        System.out.println("Original: " + original[0]);
        System.out.println("Copy: " + copy[0]);
    }
}
