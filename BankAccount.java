package Bridge_lab.this_static_final;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private static int totalAccounts = 0; // Static variable to track total accounts

    // Constructor to initialize account details
    public BankAccount(String name, String accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
        totalAccounts++; // Increment when new account is created
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }

    // Static method to show total accounts
    public static void getTotalAccounts() {
        System.out.println("\nTotal Bank Accounts: " + totalAccounts);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        // Display account details
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        // Check total accounts
        BankAccount.getTotalAccounts();

        // Deposit and withdraw operations
        System.out.println("\nPerforming transactions on Account 1:");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        System.out.println("\nPerforming transactions on Account 2:");
        account2.deposit(100);
        account2.withdraw(800); // Should show insufficient balance message
        account2.displayAccountDetails();
    }
}
