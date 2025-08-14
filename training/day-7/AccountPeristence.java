import java.io.FileWriter;

class AccountPersistence {
    public void savetoFile(BankAccount account) {
        String filename = account.AccountNumber + "_account.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(account.getAccountNumber());
            writer.write(account.getAccountHolder());
            writer.write("Balance is" + account.getBalance());
            writer.close();
        } catch (Exception d) {
        }

    }
}