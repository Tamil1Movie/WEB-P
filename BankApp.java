import java.util.Scanner;

class BankUtil {
    public static double calculateInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }
}

class Customer {
    String name;
    double principal;
    double rate;
    int years;

    // Constructor with user input
    Customer(Scanner sc, String customerName) {
        name = customerName;
        System.out.println("\nEnter details for " + name + ":");

        System.out.print("Principal: ");
        principal = sc.nextDouble();

        System.out.print("Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Time (in years): ");
        years = sc.nextInt();
    }

    void displayInterest() {
        double interest = BankUtil.calculateInterest(principal, rate, years);
        System.out.println(name + "'s Interest: ₹" + interest);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create customers using constructor
        Customer customer1 = new Customer(sc, "Customer 1");
        Customer customer2 = new Customer(sc, "Customer 2");

        // Display interests
        System.out.println("\n--- Interest Calculation ---");
        customer1.displayInterest();
        customer2.displayInterest();

        sc.close();
    }
}

