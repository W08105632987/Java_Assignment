package cos261_test;

public class Cos261_test {

    public static void main(String[] args) {
        // Question No1
        System.out.println("Hello world");
        
        // Question No2 
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);         // false (different objects)
        System.out.println(a.equals(b));    // true (same value)

        // Question 4
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        //Question 6
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        input.close();

        //Question 7
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int largest;

        // Compare the numbers
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Print the result
        System.out.println("The largest number is: " + largest);

        input.close();
     
    }
    
}

//Question 9
package cos261_test;

import java.util.Scanner;

public class Cos261_test {

    public static void main(String[] args) {
      //Question 9
      Scanner scanner = new Scanner(System.in);

        // Ask the user for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Ask the user for the range up to which the table should be printed
        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
    
}


// Question 11
package cos261_test;
import java.util.Scanner;
public class Cos261_test {

    // Student class should be defined outside the main method
    public static class Student {
        // Properties (Instance Variables)
        private String name;
        private String matricNo;
        private double score;

        // Constructor to initialize the student object
        public Student(String name, String matricNo, double score) {
            this.name = name;
            this.matricNo = matricNo;
            this.score = score;
        }

        // Method to display the student's information
        public void displayInfo() {
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Matric Number: " + matricNo);
            System.out.println("Score: " + score);
        }
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("John Doe", "MAT12345", 88.5);

        // Display the student's information
        student.displayInfo();
    }
}
 

     //question 18

    class SalaryCalculator {

    // DRY - use a method to calculate salary increment
    public static double calculateSalary(double salary) {
        return salary + (salary * 0.1); // 10% increment
    }

    public static void main(String[] args) {
        double salary1 = 5000;
        double salary2 = 6000;
        double salary3 = 7000;

        // Use the method to calculate new salary
        double newSalary1 = calculateSalary(salary1);
        double newSalary2 = calculateSalary(salary2);
        double newSalary3 = calculateSalary(salary3);

        System.out.println("New Salary 1: " + newSalary1);
        System.out.println("New Salary 2: " + newSalary2);
        System.out.println("New Salary 3: " + newSalary3);
    }
}

//question 25
class GeometryCalculator {

    /**
     * Calculates the area of a rectangle.
     * 
     * This method computes the area by multiplying the length and width
     * of the rectangle provided as parameters.
     * 
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @return The area of the rectangle.
     */
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        // Create an instance of GeometryCalculator
        GeometryCalculator calculator = new GeometryCalculator();

        // Define length and width of the rectangle
        double length = 5.0;
        double width = 3.0;

        // Calculate the area of the rectangle
        double area = calculator.calculateRectangleArea(length, width);

        // Print the result
        System.out.println("The area of the rectangle is: " + area);
    }
}

//question 31 
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private double grade;

    // Constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

    class StudentGradeTracker {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Method to add a student
    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade for " + name + ": ");
        double grade = scanner.nextDouble();
        scanner.nextLine();  // consume newline

        Student student = new Student(name, grade);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to update student grade
    public static void updateGrade() {
        System.out.print("Enter student name to update grade: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new grade for " + name + ": ");
                double newGrade = scanner.nextDouble();
                student.setGrade(newGrade);
                found = true;
                System.out.println("Grade updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
        scanner.nextLine();  // consume newline
    }

    // Method to view student records
    public static void viewRecords() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                student.displayInfo();
            }
        }
    }

    // Main method for running the program
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Grade");
            System.out.println("3. View Records");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateGrade();
                    break;
                case 3:
                    viewRecords();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

//question 32 
import java.util.Scanner;

   class ATMSystem {

    private static double balance = 0.0;  // Initial balance is 0.0

    // Method to check the balance
    public static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit money
    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("You have successfully withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Main method for ATM system operation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // ATM system loop
        do {
            System.out.println("\n--- ATM System ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);  // Loop until the user chooses to exit
    }
}


