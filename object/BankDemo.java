package Object_modeling;

class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer c, double initialDeposit) {
        c.setBalance(initialDeposit);
        System.out.println(c + " Account opened at " + bankName + " with $" + initialDeposit);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 3000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
