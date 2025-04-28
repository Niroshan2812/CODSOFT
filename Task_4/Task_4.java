package Task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {


        CurrancyRateApi crp = new CurrancyRateApi();
        double curr = crp.exchanger("USD","AED");
        System.out.println(curr);

    }

    private void userASKING (){
        UXhelper ux = new UXhelper();

        Scanner sc = new Scanner(System.in);

        System.out.println(ux.welcome);
        System.out.println(ux.askbCurrancyCode);
        String baseCurrancy = sc.nextLine();

        System.out.println(ux.asktCurrancyCode);
        String targetCurrancy = sc.nextLine();

        System.out.println(ux.askAmout);
        double amount = sc.nextDouble();
    }
}
