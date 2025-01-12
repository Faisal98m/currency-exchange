package CurrencyConvert;

import java.util.HashMap;

//instead of hardcoding the currencies, we can dynamically pull from our hashmap

public class CurrencyConverter {
    private HashMap<String,Double> exchangeRates;

    public CurrencyConverter(){
        this.exchangeRates = new HashMap<>();
        addRates();
    }

    public void addRates(){
        exchangeRates.put("USD_TO_GBP", 0.86);
        exchangeRates.put("GBP_TO_USD", 1.16);

    }

    public double convert(String source, String target, Double amount){
        // dynamically convert the users input to the key in our hashmap
        double conversion= 0;
        String key  = source + "_TO_" + target; 

        // find the "key" in our exchangeRate and then multiply it by the value
        if(exchangeRates.containsKey(key)){
            conversion= amount * exchangeRates.get(key);
        }else{
            System.out.println("Not found");
            return 0;
        }
        return conversion;
    }

    
}
