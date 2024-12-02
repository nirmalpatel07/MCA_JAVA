// Abstract Account class (cannot be instantiated)
abstract class Account {
    // Instance variables
    protected String accountNo;
    protected double balance;

    // Constructor to initialize account number and balance
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        System.out.println("Account created with Account Number: " + accountNo);
        System.out.println("Initial Balance: " + balance);
    }

    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class inherits from Account
class SavingsAccount extends Account {
    // Instance variable for interest rate
    private double interestRate;

    // Constructor for SavingsAccount, invoking superclass constructor using 'super'
    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);  // Call to superclass constructor to initialize accountNo and balance
        this.interestRate = interestRate;
        System.out.println("Interest Rate: " + interestRate);
    }

    // Override deposit method for SavingsAccount
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Savings Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Override withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    // Method to display Savings account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();  // Call superclass method to display common account details
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }
}

// CurrentAccount class inherits from Account
class CurrentAccount extends Account {
    // Instance variable for overdraft limit
    private double overdraftLimit;

    // Constructor for CurrentAccount, invoking superclass constructor using 'super'
    public CurrentAccount(String accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);  // Call to superclass constructor to initialize accountNo and balance
        this.overdraftLimit = overdraftLimit;
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    // Override deposit method for CurrentAccount
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Current Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Override withdraw method for CurrentAccount (considering overdraft limit)
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from Current Account.");
            } else {
                System.out.println("Insufficient balance and overdraft limit.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display Current account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();  // Call superclass method to display common account details
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Main class to demonstrate functionality
public class pro20 {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        System.out.println("Creating Savings Account...\n");
        SavingsAccount savingsAccount = new SavingsAccount("S12345", 5000, 4.5);
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(1500);
        savingsAccount.withdraw(3000);
        savingsAccount.displayAccountDetails();
        
        System.out.println("\n");

        // Creating a CurrentAccount object
        System.out.println("Creating Current Account...\n");
        CurrentAccount currentAccount = new CurrentAccount("C12345", 1000, 500);
        currentAccount.displayAccountDetails();
        currentAccount.deposit(2000);
        currentAccount.withdraw(2300);  // This should be within overdraft limit
        currentAccount.displayAccountDetails();
    }
}
