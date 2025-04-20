package Task_3;

public class ATMService {

    private final BankAccount account;
    UXhelper ux = new UXhelper();

  public ATMService(BankAccount account) {
      this.account = account;
  }
    public void performDeposit(double amount) {
        if(account.deposit(amount)) {
            System.out.println(ux.dpScessfull);
        }else{
            System.out.println(ux.dpFail);
        }
    }
    public void performWithdraw(double amount) {
        if(account.withdraw(amount)) {
            System.out.println(ux.wdScessfull);
        }
        else{
            System.out.println(ux.wdFail);
        }
    }
    public void checkBalance() {
        System.out.println(ux.accntAmount + account.getBalance());
    }
    public void showAccountDetails(){
      System.out.println(ux.hoder + account.getHolderName());
      System.out.println(ux.accNumber + account.getAccountNo());
    }

}
