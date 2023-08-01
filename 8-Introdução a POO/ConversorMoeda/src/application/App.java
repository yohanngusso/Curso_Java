import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f\n",CurrencyConverter.conversorDollar(dollarPrice, quantity));
        sc.close();
    }
}
