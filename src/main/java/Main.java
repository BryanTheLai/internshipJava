// src/main/java/Main.java
package main.java; // Or remove this line if you want Main.java in the default package

import main.java.adt.ArrayList; // Import your custom ArrayList
import main.java.adt.ListInterface; // Import your custom ListInterface

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Main.java test with custom ADT...");

        ListInterface<String> myList = new ArrayList<>(); // Using your custom ArrayList

        System.out.println("Is list empty? " + myList.isEmpty()); // Test isEmpty()
        System.out.println("List size: " + myList.size());      // Test size()

        myList.add("Hello"); // Test add()
        myList.add("World");

        System.out.println("Is list empty? " + myList.isEmpty()); // Test isEmpty() again
        System.out.println("List size: " + myList.size());      // Test size() again

        System.out.println("Test completed. Custom ADT ArrayList seems to be working.");
    }
}