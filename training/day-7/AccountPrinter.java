class AccountPrinter {
    public void printAccountDetails(BankAccount account) {
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());
    }
}
