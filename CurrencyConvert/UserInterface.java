package CurrencyConvert;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private CurrencyConverter converter;
    
    public UserInterface(CurrencyConverter converter, Scanner scanner){
        this.scanner = new Scanner(System.in);
        this.converter = converter;
    }


    public void start(){
        while (true) {
            System.out.println("Enter amount:");
            String input= scanner.nextLine();

            if(input.isEmpty()){
                System.out.println("Amount is Empty");
                break;
            }

            Integer amount = Integer.valueOf(input);
            converter.addAmount(amount);

            System.out.println("Source Currency: ");
            String currencyInput = scanner.nextLine();

            System.out.println("Target Currency: ");
            String exchange = scanner.nextLine();

            converter.addToCurrency(currencyInput, exchange);

            converter.dollarsToGBP();

        }
    }
}
