package CurrencyConvert;
import java.util.Scanner;



public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        CurrencyConverter converter = new CurrencyConverter();


        UserInterface ui =  new UserInterface(converter, scanner);

        ui.start();


    }
}
