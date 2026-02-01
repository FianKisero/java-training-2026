/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Fian Kisero
 * Date: 2/2/2026
 * Problem: 2
 *
 * Key Features:
 * - Instantiation, and encapsulation.
 * - custom exceptions
 * - [Any additional notable implementations]
 */
package Assignments.Assignments3_FianKisero.Problem2;

import Assignments.Assignments3_FianKisero.Problem2.exceptions.AccountNotFoundException;
import Assignments.Assignments3_FianKisero.Problem2.exceptions.InsufficientFundsException;
import Assignments.Assignments3_FianKisero.Problem2.exceptions.InvalidTransactionException;

public class BankSystem {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("ACC001", "Alice", 1000);
            BankAccount account2 = new BankAccount("ACC002", "Bob", 500);


            account1.deposit(-100); // Should throw InvalidTransactionException
            account1.withdraw(2000); // Should throw InsufficientFundsException
            account1.transfer("INVALID", 100); // Should throw AccountNotFoundException
        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}
