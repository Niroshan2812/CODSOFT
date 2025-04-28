package Task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //Asking
        UXhelper ux = new UXhelper();
        CurrancyRateApi apiCall = new CurrancyRateApi();
        CurrancyConverter converter = new CurrancyConvert(apiCall);
        Scanner sc = new Scanner(System.in);

        System.out.println(ux.welcome);
        System.out.print(ux.askbCurrancyCode);
        String baseCurrancy = sc.nextLine();

        System.out.print(ux.asktCurrancyCode);
        String targetCurrancy = sc.nextLine();

        System.out.print(ux.askAmout);
        double amount = sc.nextDouble();

        // Exchanger
        try{
            FinalResultContainner result = converter.convert(baseCurrancy, targetCurrancy, amount);
            System.out.println(ux.sparator );
            System.out.println("Converted Amount: "+  result.getConvertedAmount() + result.getTargetCurrency().getSymbole());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    sc.close();
    }

}
