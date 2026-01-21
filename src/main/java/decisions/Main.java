package decisions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        idRegistration();
        gradingSystem();


    }
    public static void gradingSystem() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        if (marks >= 90) {
            System.out.println("You have an A");
        }
        else if (marks >= 80) {
            System.out.println("You have an B");
        }
        else if (marks >= 70) {
            System.out.println("You have an C");
        }
        else if (marks >= 60) {
            System.out.println("You have an D");
        }
        else if (marks >= 50) {
            System.out.println("You have an E");
        }
        else if (marks >= 40) {
            System.out.println("You have an F");
        }
        else if (marks >= 30) {
            System.out.println("You have an G");
        }
        else if (marks >= 20) {
            System.out.println("You have an H");
        }
        else {
            System.out.println("You have failed");
        }
    }
    public static void idRegistration() {
        Scanner sc = new Scanner(System.in);

        final int QUALIFICATION_AGE = 18;

        //id registration
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (age >= QUALIFICATION_AGE) {
            //proceed with registration information gathering
            System.out.println("Enter your name");
            String name = sc.nextLine();


            System.out.println("Enter your location");
            String location = sc.nextLine();

            //proceed other processing
            System.out.printf("You are now registered:%s\n and you are located in: %s ", name , location);
        }
        System.out.println("After registration ");
    }

}
