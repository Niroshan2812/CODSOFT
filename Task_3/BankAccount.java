package Task_3;

public class BankAccount implements AccountOperations {
    private String accountNo;
    private String holderName;
    private double balance;

    public BankAccount(String accountNo, String holderName, double initialbalance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = initialbalance;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount>0 && amount<=balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

}
