interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
abstract class BankAccount implements AccountOperations {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    @Override
    public double checkBalance() {
        System.out.println("Account Balance: $" + balance);
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interestAmount = getBalance() * interestRate / 100;
        deposit(interestAmount);
        System.out.println("Interest applied: $" + interestAmount);
    }
}
class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeding overdraft limit.");
        }
    }
}
class LoanAccount extends BankAccount {
    private double interestRate;
    public LoanAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interestAmount = getBalance() * interestRate / 100;
        withdraw(interestAmount);
        System.out.println("Interest applied: $" + interestAmount);
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 2.5);
        savingsAccount.deposit(500.0);
        savingsAccount.applyInterest();
        savingsAccount.checkBalance();

        CheckingAccount checkingAccount = new CheckingAccount("CA456", 2000.0, 1000.0);
        checkingAccount.withdraw(1500.0);
        checkingAccount.checkBalance();
        
        LoanAccount loanAccount = new LoanAccount("LA789", 5000.0, 5.0);
        loanAccount.applyInterest();
        loanAccount.checkBalance();
    }
}