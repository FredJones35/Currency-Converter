package currencyconverter;

public class CurrencyComparer {
    public static boolean checkSame(Currency c1, Currency c2){
        return c1.toString().equals(c2.toString());
    }
}
