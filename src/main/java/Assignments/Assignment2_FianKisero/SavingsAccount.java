package Assignments.Assignment2_FianKisero;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double initialBalance, double interestRate)
            throws InvalidAmountException {

        super(accountNumber, accountHolder, initialBalance);

        if (initialBalance < MIN_BALANCE) {
            throw new InvalidAmountException(
                    "Savings account requires minimum balance of $100");
        }

        setInterestRate(interestRate);
    }

    public void setInterestRate(double interestRate) {
        if (interestRate <= 0) {
            throw new IllegalArgumentException("Interest rate must be positive");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }

        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException(
                    "Cannot withdraw: Minimum balance of $100 required");
        }

        balance -= amount;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount[%s, Interest Rate: %.2f%%]",
                super.toString(), interestRate * 100);
    }
}

