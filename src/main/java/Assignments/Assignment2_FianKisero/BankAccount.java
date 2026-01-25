package Assignments.Assignment2_FianKisero;

/**
 * Basic Bank Account System
 * Student: Fian Kisero
 */

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    protected double balance; // protected for subclasses

    public BankAccount(String accountNumber, String accountHolder, double initialBalance)
            throws InvalidAmountException {

        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);

        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // Encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    private void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Operations
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account[%s | Holder: %s | Balance: %.2f]",
                accountNumber, accountHolder, balance);
    }
}

