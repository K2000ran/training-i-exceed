public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("1234567890", "John Doe", 5000.0);

        // Deposit money
        account.deposit(1500.0);

        // Withdraw money
        account.withDraw(2000.0);

        // Print account details
        AccountPrinter printer = new AccountPrinter();
        printer.printAccountDetails(account);

        // Save account details to a file
        AccountPersistence persistence = new AccountPersistence();
        persistence.savetoFile(account);

        System.out.println("Account operations completed.");
    }
}
