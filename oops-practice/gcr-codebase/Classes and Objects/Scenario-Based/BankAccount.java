public class BankAccount {

   
    private int accountNumber;
    private String holder;
    private double balance;

   
    static int totalAccounts = 0;

   
    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Transaction Failed! Insufficient Balance.");
        }
    }

   
    void getStatement() {
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holder);
        System.out.println("Current Balance: ₹" + balance);
    }

    
    static void displayTotalAccounts() {
        System.out.println("\nTotal Accounts Created: " + totalAccounts);
    }

    
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Shruti", 10000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 15000);
        BankAccount acc3 = new BankAccount(103, "Aman", 20000);

        
        System.out.println("\nTransactions for Shruti");
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(10000);
        acc1.getStatement();

        // 5 Transactions for Account 2
        System.out.println("\nTransactions for Rahul");
        acc2.deposit(5000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(7000);
        acc2.deposit(500);
        acc2.getStatement();

        // 5 Transactions for Account 3
        System.out.println("\nTransactions for Aman");
        acc3.withdraw(3000);
        acc3.deposit(4000);
        acc3.withdraw(5000);
        acc3.deposit(2000);
        acc3.withdraw(10000);
        acc3.getStatement();

        // Display Total Accounts
        displayTotalAccounts();
    }
}