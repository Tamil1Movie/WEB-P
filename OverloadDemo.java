import java.util.Scanner;

class PrintData {
    void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintData pd = new PrintData();

        // First method call
        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a character: ");
        char ch1 = sc.next().charAt(0);
        pd.print(num1, ch1);

        // Second method call
        System.out.print("Enter a character: ");
        char ch2 = sc.next().charAt(0);
        System.out.print("Enter an integer: ");
        int num2 = sc.nextInt();
        pd.print(ch2, num2);

        sc.close();
    }
}
