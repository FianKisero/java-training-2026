package Assignment1_FianKisero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        question1VariableOperations();
        question2GradeCalculator();
        question3NumberSequence();
        question4InputValidation();
        question5PatternPrinting();
        question6SimpleConsoleCalculator();
    }
    /*Quiz Problem 1: Variable Operations
Create a program that:
1. Declares three integer variables: a = 15, b = 4, c = 7
2. Calculates and displays:
The sum of all three numbers
The product of a and b
The result of (a + b) * c
The remainder when a is divided by b
3. Uses appropriate variable names and comments*/
    public static void question1VariableOperations(){
        int a = 15, b=4, c=7;

        System.out.println("Sum: "  + (a + b + c));
        System.out.println("Product: " + (a * b));
        System.out.println("Expression Result: "  +  ((a + b) * c));
        System.out.println("Remainder: "  + (a % b));
    }

    /*Quiz Problem 2: Grade Calculator
Write a program that:
1. Takes a student's score (0-100) as input
2. Determines the grade using this scale:
90-100: A
80-89: B
70-79: C
60-69: D
Below 60: F
3. Uses if-else statements for the logic
4. Handles invalid input (scores outside 0-100)*/

    public static void question2GradeCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students score: ");
        int marks = sc.nextInt();
        sc.nextLine();

        if (marks >= 101 || marks <= -1) {
            System.out.println("invalid input");
        }
        else if (marks >= 90) {
            System.out.println("A");
        }
        else if (marks >= 80) {
            System.out.println("B");
        }
        else if (marks >= 70) {
            System.out.println("C");
        }
        else if (marks >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }

    /*Quiz Problem 3: Number Sequence
Create a program that:
1. Uses a for loop to print numbers from 1 to 20
2. For each number, print:
"Even" if the number is even
"Odd" if the number is odd
"Multiple of 5" if divisible by 5
3. Use the modulus operator (%) for checks*/

    public static void question3NumberSequence() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20};

        for(int number: numbers){

            if (number % 2 == 0 ) {

                if (number % 5 == 0) {
                    System.out.println(number + "- Even ,Multiple of 5");
                }else{
                    System.out.println(number + "- Even");
                }

            } else{

                    if (number % 5 == 0) {
                        System.out.println(number + "- Odd ,Multiple of 5");
                    }else{
                        System.out.println(number + "- Odd");
                    }
            }

        }
    }

    /*Write a program that:
1. Asks the user to enter a positive integer
2. Use a while loop to keep asking until valid input is received
3. Validates that the input is positive
4. Once valid input is received, calculates and displays its factorial*/
    public static void question4InputValidation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        sc.nextLine();
        while (number < 0) {
            System.out.print("Invalid input! Please enter a positive integer:");
            number = sc.nextInt();
        }

        int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);


    }

    /*Quiz Problem 5: Pattern Printing
Write a program that:
1. Uses nested for loops
2. Prints a right-angled triangle pattern of asterisks
3. The triangle should have 5 rows
4. First row: 1 asterisk, second row: 2 asterisks, etc.*/

    public static void question5PatternPrinting() {
        int rows = 5;


        for (int i = 1; i <= rows; ++i) {

            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }



    }

    /*Calculator Requirements
Core Features (Required):
1. Basic Operations: Addition, subtraction, multiplication, division
2. User Interface: Clear menu-driven system
3. Continuous Operation: Calculate multiple times without restarting
4. Exit Option: Clean program termination*/

    public static void question6SimpleConsoleCalculator() {

        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {

            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus (Bonus)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            if (choice == 6) {
                System.out.println("Thank you for using Simple Calculator!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid option! Please try again.");
                continue;
            }

            double num1, num2;

            try {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid number format! Please enter valid numbers.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;

                case 5:
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
            }

            System.out.print("Would you like to perform another calculation? (y/n): ");
            scanner.nextLine();
            String response = scanner.nextLine();

            if (!response.equalsIgnoreCase("y")) {
                continueCalculating = false;
                System.out.println("Thank you for using Simple Calculator!");
            }
        }

        scanner.close();
    }

}
