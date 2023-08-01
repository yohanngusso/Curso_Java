package utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    
    public static double conversorDollar (double price, double quantity){
        double value = price * quantity;
        return value + (value*IOF);
    }
}
