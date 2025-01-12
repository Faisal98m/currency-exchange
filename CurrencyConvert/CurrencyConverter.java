package CurrencyConvert;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private HashMap<String,String> currencies;
    private double amount;

    public CurrencyConverter(){
        this.currencies = new HashMap<>();
        this.amount = 0;
    }

    public void addAmount(double amount){
        this.amount = amount;
    }

    public void addToCurrency(String currency, String exchange){
        this.currencies.put(currency, exchange);        
    }


    public void dollarsToGBP(){
        //let's do some psuedo

        // Our aim in this method is to convert the currency to the exchange based on what the user wants
        // for example if the currency is USD and wants to convert to GBP
        // we multiply the USD by 0.8 to get GBP 
        // then we need to print out the returned value

        double exchangeRate = 0;

        for (Map.Entry<String, String> entry : currencies.entrySet()) {
            String key = entry.getKey(); // the key (e.g., "USD")
            String value = entry.getValue(); // the value (e.g., "GBP")
            
            if (key.equals("USD") && value.equals("GBP")) {
                exchangeRate = this.amount * 0.86;
            }
        }
    
        System.out.println(exchangeRate);

    }
    
}
