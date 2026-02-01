package Assignments.Assignments3_FianKisero.Problem2;

import Assignments.Assignments3_FianKisero.Problem2.exceptions.AccountNotFoundException;
import Assignments.Assignments3_FianKisero.Problem2.exceptions.InsufficientFundsException;
import Assignments.Assignments3_FianKisero.Problem2.exceptions.InvalidTransactionException;

import java.util.HashMap;
import java.util.Map;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private static Map<String, BankAccount> allAccounts = new HashMap<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

        // Add this new account to our "database"
        allAccounts.put(accountNumber, this);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new InvalidTransactionException("Deposit amount cannot be negative: " + amount);
        }
        this.balance += amount;
        System.out.println("Success: Deposited " + amount + " to " + this.accountNumber);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidTransactionException("Withdrawal amount cannot be negative.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException("Required: " + amount + ", Available: " + this.balance);
        }
        this.balance -= amount;
        System.out.println("Success: Withdrew " + amount + " from " + this.accountNumber);
    }

    public void transfer(String toAccountNumber, double amount)
            throws AccountNotFoundException, InsufficientFundsException {

        if (!allAccounts.containsKey(toAccountNumber)) {
            throw new AccountNotFoundException("Target account ID " + toAccountNumber + " does not exist.");
        }

        BankAccount targetAccount = allAccounts.get(toAccountNumber);

        this.withdraw(amount);

        targetAccount.deposit(amount);
        System.out.println("Success: Transferred " + amount + " to " + toAccountNumber);
    }
}