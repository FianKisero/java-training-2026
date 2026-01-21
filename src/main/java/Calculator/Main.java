package Calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("\nWhat Operation do you want to perform:");
            String operations = scanner.nextLine();
            switch (operations) {
                case "Add":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "Subtract":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "Multiply":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "Divide":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case "Remainder":
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid Operation");

            }

            System.out.println("Do you want to continue? y/n");
            answer = scanner.nextLine();



        } while (answer.equalsIgnoreCase("y"));

        scanner.close();
    }
    }
