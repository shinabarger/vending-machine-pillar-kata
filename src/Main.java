import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by David Shinabarger March 2017
 * Pillar Kata for Apprenticeship Program
 * You can view the instructions for the program in the README.md
 */

public class Main {

    public static void main(String args) {

        double total = 0;
        double coinReturn;

        String totalAmountInDollarFormat;

        String userProductChoice = Validator.pickChipsColaOrCandy("TYPE COLA, CHIPS, or CANDY to SELECT");

        //get price of product
        double priceOfTheUserChoice = chosenItemPrice(userProductChoice);
        String priceOfTheUserChoiceInDollarAmount = String.format("%.2g%n", priceOfTheUserChoice);
        String coinInsertedByUser = Validator.isValidCoin(args);

        //add Coins to Total
        total = addCoinsToTotal(coinInsertedByUser);
        totalAmountInDollarFormat = String.format("%.2g%n", total);
        System.out.println(userProductChoice + " costs " + priceOfTheUserChoiceInDollarAmount + "\nTotal inserted is: " + totalAmountInDollarFormat);

        String userContinueYesOrNo = Main.userWishesToContinueOrLeave("yes");

        if (userContinueYesOrNo.equalsIgnoreCase("n")) {
            coinReturn = priceOfTheUserChoice;
            String coinReturnTotal = String.format("%.2g%n", coinReturn);
            System.out.println("Total coin return is: " + coinReturnTotal);

        } else if (userContinueYesOrNo.equalsIgnoreCase("y")) {
            coinReturn = (total - priceOfTheUserChoice);
            totalAmountInDollarFormat = String.format("%.2g%n", coinReturn);
            System.out.println("Your total is " + totalAmountInDollarFormat);
            total = 0.00;

        } else {
            total = priceOfTheUserChoice - total;

            if (total < 0) {
                total = 0.0;
            }
            totalAmountInDollarFormat = String.format("%.2g%n", total);
            System.out.println("Okay, you have " + totalAmountInDollarFormat + " left to use.");
        }

    }

    public static Double addCoinsToTotal(String coinInput) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner scan = new Scanner(System.in);

        double totalAmountInserted = 0.00;
        double coinReturnTotal = 0.00;

        if (coinInput.equals("dime")) {

            totalAmountInserted += 0.10;
            coinInput = String.format("%.2g%n", totalAmountInserted);

        } else if (coinInput.equals("nickel")) {
            totalAmountInserted += 0.05;
        } else if (coinInput.equals("quarter")) {

            totalAmountInserted += 0.25;
        }
        formatter.format(totalAmountInserted);
        return totalAmountInserted;
    }

    public static Double chosenItemPrice(String chosenItem) {
        double priceOfItem = 0.0;

        switch (chosenItem.toLowerCase()) {
            case "cola":
                priceOfItem += 1.00;
                break;
            case "chips":
                priceOfItem += 0.50;
                break;

            case "candy":
                priceOfItem += 0.65;
                break;
        }
        return priceOfItem;
    }

    public static String coinReturnTotal(String coin) {
        if (coin.equals("penny")) {
            double coinReturn = 0.01;

            coin = Double.toString(coinReturn);
        }
        return coin;

    }

    public static String userWishesToContinueOrLeave(String userChoiceToContinue) {
        if (userChoiceToContinue.equalsIgnoreCase("yes")) {
            return userChoiceToContinue;
        } else return "invalid entry";

    }

}

