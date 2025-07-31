import java.util.*;

public class SortStringList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> names = new ArrayList<>();

        // Input strings
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            names.add(str);
        }

        // Sorting alphabetically
        Collections.sort(names);

        // Display sorted list
        System.out.println("\nSorted List:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
