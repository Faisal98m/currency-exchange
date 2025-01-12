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

            Double amount = Double.parseDouble(input);
            System.out.println("Source Currency: ");
            String source = scanner.nextLine().toUpperCase();

            System.out.println("Target Currency: ");
            String target = scanner.nextLine().toUpperCase();

            double result =converter.convert(source,target, amount);

            System.out.println("Conversion: "+ result);
        }
    }
}
