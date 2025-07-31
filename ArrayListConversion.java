import java.util.*;

public class ArrayListConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input array elements
        String[] array = new String[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLine();
        }

        // Convert array to list
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("\nArray to List:");
        System.out.println(list);

        // Convert list back to array
        String[] newArray = list.toArray(new String[0]);
        System.out.println("\nList to Array:");
        for (String s : newArray) {
            System.out.println(s);
        }
    }
}
