package ajpLAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
    public static void main(String[] args) {
        // Create and initialize a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("mango");

        // Print the original list
        System.out.println("Original list: " + strings);

        // Reverse the list
        reverseList(strings);

        // Print the reversed list
        System.out.println("Reversed list: " + strings);
    }

    // Method to reverse a list of strings
    public static void reverseList(List<String> list) {
        // Collections.reverse method reverses the order of elements in the specified list
        Collections.reverse(list);
    }
}
