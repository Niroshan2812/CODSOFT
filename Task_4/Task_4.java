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
        System.out.println(ux.askbCurrancyCode);
        String baseCurrancy = sc.nextLine();

        System.out.println(ux.asktCurrancyCode);
        String targetCurrancy = sc.nextLine();

        System.out.println(ux.askAmout);
        double amount = sc.nextDouble();

        // Exchanger
        try{
            FinalResultContainner result = converter.convert(baseCurrancy, targetCurrancy, amount);
            System.out.println("Converted Amount: "+  result.getConvertedAmount());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    sc.close();
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
