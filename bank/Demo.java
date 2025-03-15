class BankAccount {
    int accountNumber;
    double balance;
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: ₹" + balance);
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: ₹" + balance);
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied! Balance must remain above ₹500.");
        }
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (balance < 1000) {
            balance -= 50; 
            System.out.println("₹50 charge applied. New balance: ₹" + balance);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 2000);
        CurrentAccount current = new CurrentAccount(102, 1200);
       savings.withdraw(1600);
        current.withdraw(500);
    }
}
