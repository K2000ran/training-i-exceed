class BankAccount {
    String AccountNumber, AccountHolder;
    double balance;

    public BankAccount(String AccountNumber, String AccountHolder, double balance) {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance After deposit" + balance);
    }

    public void withDraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("In sufficient Balance");
        }
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public double getBalance() {
        return balance;
    }
}