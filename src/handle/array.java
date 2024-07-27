package handle;

import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> list = new ArrayList<>();
        list.add("Iphone");
        list.add("Samsung");
        list.add("Vivo");
        list.add("Sony");

        // Convert the List to an array
        String[] array = list.toArray(new String[0]);

        // Print the array elements
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
