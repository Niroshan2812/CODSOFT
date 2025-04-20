package Task_3;

public class Task_3 {
    public static void main(String[] args) {
       ATMview atmview = new ATMview();
       BankAccount bk = new BankAccount("E2233113", "Niroshan", 78000);

       /*
       if(bk.withdraw(7800)){
           System.out.println(bk.getBalance());
       }
       else{
           System.out.println(bk.getBalance());
       }
    */
        if(bk.deposit(4444)){
            System.out.println("Deposit Successful");
            System.out.println(bk.getBalance());
            System.out.println(bk.getHolderName());
            System.out.println(bk.getAccountNo());
        }
        else{
            System.out.println("Deposit Failed");
        }


    }
}
