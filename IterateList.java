import java.util.*;

public class IterateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input list size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> fruits = new ArrayList<>();

        // Input list elements
        System.out.println("Enter " + n + " fruit names:");
        for (int i = 0; i < n; i++) {
            fruits.add(scanner.nextLine());
        }

        // Using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
