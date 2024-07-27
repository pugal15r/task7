package handle;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Suresh");
        list.add("Mahesh");

        // Print the ArrayList before removal
        System.out.println("ArrayList before removal: " + list);

        // Remove all elements from the ArrayList
        list.clear();

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + list);
    }
}
