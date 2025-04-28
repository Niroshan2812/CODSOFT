package Task_4;

public class FinalResultContainner {
    private double convertedAmount;
    private Currency targetCurrency;

    public FinalResultContainner(double convertedAmount, Currency targetCurrency) {
        this.convertedAmount = convertedAmount;
        this.targetCurrency = targetCurrency;
    }
    public double getConvertedAmount() {
        return convertedAmount;
    }
    public Currency getTargetCurrency() {
        return targetCurrency;
    }
}
