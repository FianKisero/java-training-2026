package Assignments.Assignment2_FianKisero;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder,
                           double initialBalance, double overdraftLimit)
            throws InvalidAmountException {

        super(accountNumber, accountHolder, initialBalance);

        if (overdraftLimit < 0) {
            throw new InvalidAmountException("Overdraft limit cannot be negative");
        }

        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }

        if (balance - amount < -overdraftLimit) {
            throw new InsufficientFundsException("Overdraft limit exceeded");
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("CheckingAccount[%s, Overdraft Limit: %.2f]",
                super.toString(), overdraftLimit);
    }
}

