import java.util.Scanner;

class StringHandler {
    StringBuffer stringBuffer;
    StringBuilder stringBuilder;

    // Constructor initializes both buffers
    StringHandler(String initial) {
        stringBuffer = new StringBuffer(initial);
        stringBuilder = new StringBuilder(initial);
    }

    void performOperations(Scanner sc) {
        // StringBuffer operations
        System.out.println("---- StringBuffer Operations ----");
        System.out.println("Initial Content: " + stringBuffer);
        System.out.println("Initial Capacity: " + stringBuffer.capacity());

        stringBuffer.reverse();
        System.out.println("Reversed: " + stringBuffer);

        stringBuffer.reverse(); // revert to original

        String upper = stringBuffer.toString().toUpperCase();
        System.out.println("Uppercase: " + upper);

        System.out.print("Enter a string to append: ");
        sc.nextLine(); // consume newline
        String userInput = sc.nextLine();

        stringBuffer.append(userInput);
        System.out.println("After Append: " + stringBuffer);

        // StringBuilder operations
        System.out.println("\n---- StringBuilder Operations ----");
        System.out.println("Initial Content: " + stringBuilder);
        System.out.println("Initial Capacity: " + stringBuilder.capacity());

        stringBuilder.reverse();
        System.out.println("Reversed: " + stringBuilder);
    }
}

public class StringHandlingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial string: ");
        String input = sc.nextLine();

        // Initialize via constructor
        StringHandler handler = new StringHandler(input);

        // Perform operations
        handler.performOperations(sc);

        sc.close();
    }
}
