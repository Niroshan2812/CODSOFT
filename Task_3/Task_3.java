package Task_3;

public class Task_3 {
    public static void main(String[] args) {

       BankAccount bk = new BankAccount("E2233113", "Niroshan", 78000);

       /*
       if(bk.withdraw(7800)){
           System.out.println(bk.getBalance());
       }
       else{
           System.out.println(bk.getBalance());
       }
    */
        ATMService atm = new ATMService(bk);

      ATMview atmview = new ATMview(atm);
      atmview.start();




    }
}
