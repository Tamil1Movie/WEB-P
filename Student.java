//Create a Student class with attributes like name, roll number, and marks in different subjects.
//Implement methods to calculate total marks, percentage, and grade.

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    // Constructor
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate total marks
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate percentage
    public double getPercentage() {
        return (double) getTotalMarks() / marks.length;
    }

    // Method to calculate grade
    public String getGrade() {
        double percentage = getPercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks      : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + getTotalMarks());
        System.out.printf("Percentage : %.2f%%\n", getPercentage());
        System.out.println("Grade      : " + getGrade());
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Get roll number
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        // Get number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Get marks
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Create student object and display details
        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();

        scanner.close();
    }
}
