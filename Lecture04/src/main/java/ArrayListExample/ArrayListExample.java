package ArrayListExample;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // add Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add: " + fruits);

        // contact Element with index
        System.out.println("Element at index 1: " + fruits.get(1));

        // remove Element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // check number of elements
        System.out.println("Number of elements: " + fruits.size());

        // remove all elements
        fruits.clear();
        System.out.println("After clearing all elements: " + fruits);

    }
}
