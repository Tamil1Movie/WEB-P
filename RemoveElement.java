import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter number of elements in the list: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<String> items = new ArrayList<>();

        // Input list elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            items.add(scanner.nextLine());
        }

        // Input element to remove
        System.out.print("Enter element to remove: ");
        String elementToRemove = scanner.nextLine();

        // Remove all occurrences
        items.removeAll(Collections.singleton(elementToRemove));

        // Output
        System.out.println("List after removing '" + elementToRemove + "':");
        System.out.println(items);
    }
}
