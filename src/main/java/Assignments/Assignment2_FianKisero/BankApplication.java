/*Mainclass for Assignment2 Bank System
Fian Kisero
Assignment2_FianKisero

 */
package Assignments.Assignment2_FianKisero;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {

                    case 1 -> {
                        System.out.print("Account Number: ");
                        String accNo = scanner.nextLine();
                        System.out.print("Holder Name: ");
                        String holder = scanner.nextLine();
                        System.out.print("Initial Balance: ");
                        double bal = scanner.nextDouble();
                        System.out.print("Interest Rate: ");
                        double rate = scanner.nextDouble();

                        bank.addAccount(
                                new SavingsAccount(accNo, holder, bal, rate));
                    }

                    case 2 -> {
                        System.out.print("Account Number: ");
                        String accNo = scanner.nextLine();
                        System.out.print("Holder Name: ");
                        String holder = scanner.nextLine();
                        System.out.print("Initial Balance: ");
                        double bal = scanner.nextDouble();
                        System.out.print("Overdraft Limit: ");
                        double limit = scanner.nextDouble();

                        bank.addAccount(
                                new CheckingAccount(accNo, holder, bal, limit));
                    }

                    case 3 -> {
                        System.out.print("Account Number: ");
                        String accNo = scanner.nextLine();
                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();

                        bank.findAccount(accNo).deposit(amount);
                    }

                    case 4 -> {
                        System.out.print("Account Number: ");
                        String accNo = scanner.nextLine();
                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();

                        bank.findAccount(accNo).withdraw(amount);
                    }

                    case 5 -> {
                        System.out.print("Account Number: ");
                        String accNo = scanner.nextLine();
                        System.out.println(bank.findAccount(accNo));
                    }

                    case 6 -> bank.applyInterestToSavingsAccounts();
                    case 7 -> bank.displayAllAccounts();
                    case 8 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

