package Task_4;

public class CurrancyConvert implements CurrancyConverter {

    //fetch api data
    private CurrancyRateApi currancyRateApi;

    public CurrancyConvert (CurrancyRateApi currancyRateApi) {
        this.currancyRateApi = currancyRateApi;
    }

    @Override
    public FinalResultContainner convert(String baseCurrancy, String targetCurrancy, double amount) {
        double rate = currancyRateApi.exchanger(baseCurrancy,targetCurrancy);
        //multiply with exchange rate
        double convertedAmount = amount * rate;
        Currency cr = new Currency(targetCurrancy, null);
        return new FinalResultContainner(convertedAmount, cr);
    }
}
