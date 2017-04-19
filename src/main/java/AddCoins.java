package main.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by davidshinabarger on 4/19/17.
 */
public class AddCoins {

    public static Double addCoinsToTotal(String coinInput) {
        NumberFormat formatToTwoDecimalPlaces = new DecimalFormat("#0.00");
        double totalAmountInserted = 0.00;

        if (coinInput.equals("dime")) {
            totalAmountInserted += 0.10;

        } else if (coinInput.equals("nickel")) {
            totalAmountInserted += 0.05;

        } else if (coinInput.equals("quarter")) {
            totalAmountInserted += 0.25;
        }
        formatToTwoDecimalPlaces.format(totalAmountInserted);
        return totalAmountInserted;
    }
}
