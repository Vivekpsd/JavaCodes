import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Accessing elements by index
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("After removing Banana: " + arrayList);

        // Sorting the ArrayList
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Iterating over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
