package Lecture1.arrayexample;

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Elephant", "Lion",
                "Dog", "Cat", "Elephant", "Lion",
                "Dog", "Cat", "Elephant", "Lion"};

        for (String animal : animals) {
            System.out.println("animal: " + animal);
        }

        for(int i = 0 ; i < animals.length; i++){
            System.out.println("animals[" + i + "] = " + animals[i]);
        }
    }
}
