class BankAccount {
    // ✅ Private data member: hides internal state
    private double balance;

    // ✅ Constructor with validation logic
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;  // Prevent negative balance
        }
    }

    // ✅ Public getter: controlled read access
    public double getBalance() {
        return balance;
    }

    // ✅ Public setter: controlled write access with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // ✅ Another setter: ensures safe withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // ✅ Creating object with initial balance
        BankAccount account = new BankAccount(1000);

        // ✅ Using public methods to modify private data
        account.deposit(500);     // Deposit money
        account.withdraw(200);    // Withdraw money

        // ✅ Accessing private data via getter
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}

