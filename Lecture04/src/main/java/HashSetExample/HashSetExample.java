package HashSetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        // add Elements
        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea"); // Duplicate element, will not be added again

        // Display the HashSet
        System.out.println("Countries: " + countries);

        // Display the HashSet with included elements
        System.out.println("Countries with included elements: " + countries.contains("Japan"));

        // delete element
        countries.remove("Japan");
        System.out.println("Countries after removing Japan: " + countries);

        // check number of elements
        System.out.println("Number of countries: " + countries.size());

        // Delete all elements
        countries.clear();
        System.out.println("Countries after clearing all elements: " + countries);
    }
}
