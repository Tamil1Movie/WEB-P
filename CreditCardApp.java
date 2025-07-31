import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Money {
    double amount;

    Money(double amount) {
        this.amount = amount;
    }

    // Copy constructor
    Money(Money m) {
        this.amount = m.amount;
    }

    public String toString() {
        return "₹" + amount;
    }
}

class CreditCard {
    Person owner;
    Money balance;
    Money creditLimit;

    // Constructor with default balance = 0
    CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0.0);
    }

    // Overloaded constructor for custom balance and credit limit
    CreditCard(Person owner, Money balance, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(balance);
        this.creditLimit = new Money(creditLimit);
    }

    void display() {
        System.out.println("Owner: " + owner.name);
        System.out.println("Balance: " + balance);
        System.out.println("Credit Limit: " + creditLimit);
    }
}

public class CreditCardApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for basic card
        System.out.print("Enter owner's name: ");
        String name = sc.nextLine();

        System.out.print("Enter credit limit: ");
        double creditLimitValue = sc.nextDouble();

        Person p1 = new Person(name);
        Money creditLimit = new Money(creditLimitValue);

        CreditCard card1 = new CreditCard(p1, creditLimit);
        System.out.println("\n--- Default Card Details ---");
        card1.display();

        // Input for custom card
        System.out.println("\n--- Enter Custom Card Details ---");

        System.out.print("Enter owner's name: ");
        sc.nextLine(); // consume newline
        String name2 = sc.nextLine();

        System.out.print("Enter balance: ");
        double balanceValue = sc.nextDouble();

        System.out.print("Enter credit limit: ");
        double creditLimitValue2 = sc.nextDouble();

        Person p2 = new Person(name2);
        Money balance = new Money(balanceValue);
        Money creditLimit2 = new Money(creditLimitValue2);

        CreditCard card2 = new CreditCard(p2, balance, creditLimit2);
        System.out.println("\n--- Custom Card Details ---");
        card2.display();

        sc.close();
    }
}
