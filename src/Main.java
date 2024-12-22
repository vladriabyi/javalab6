import java.util.Arrays;

/**
 * Main class to demonstrate the functionality of the ResizableList.
 */
public class Main {
    public static void main(String[] args) {
        // Creating an empty list
        ResizableList<String> list = new ResizableList<>();
        list.add("Ruby");
        list.add("Diamond");
        list.add("Emerald");
        list.add("Sapphire");

        // Display the list after adding elements
        System.out.println("List after adding gemstones: " + list);

        // Remove an element at index 1 (Diamond)
        list.remove(1);

        // Display the list after removal
        System.out.println("List after removing second gemstone: " + list);

        // Get the first gemstone in the list
        System.out.println("First gemstone in the list: " + list.get(0));

        // Check if the list contains a specific gemstone
        System.out.println("List contains Diamond? " + Arrays.asList(list.get(0)).contains("Diamond"));

        // Clear the list
        list.remove(0);
        System.out.println("List after clearing: " + list);
    }
}
