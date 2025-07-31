import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int[] freq = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            freq[i] = -1; // Initialize frequency array
        }

        // Calculate frequency
        for (int i = 0; i < size; i++) {
            if (freq[i] != -1)
                continue; // Skip already counted elements

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    freq[j] = 0; // Mark as counted
                }
            }
            freq[i] = count; // Store frequency
        }

        // Print frequencies
        System.out.println("Element : Frequency");
        for (int i = 0; i < size; i++) {
            if (freq[i] != 0) {
                System.out.println(array[i] + " : " + freq[i]);
            }
        }
    }
}
