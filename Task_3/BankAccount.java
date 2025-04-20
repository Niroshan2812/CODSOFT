package Task_3;

public class BankAccount {
    private String accountNo;
    private String holderName;
    private double balance;

    public BankAccount(String accountNo, String holderName, double initialbalance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = initialbalance;
    }
}
