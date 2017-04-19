package main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by David Shinabarger March 2017
 * Pillar Kata for Apprenticeship Program
 * You can view the instructions for the program in the README.md
 */

public class Main {

    public static void main(String[] args) {

        String userProductChoice;
        double priceOfTheUserChoice;
        String coinInsertedByUser;
        double coinTotal;

        userProductChoice = getProductChoiceFromUser("Cola");

        priceOfTheUserChoice = getChosenItemPrice(userProductChoice);

        coinInsertedByUser = Validator.isValidCoin(String.valueOf(args));

        coinTotal = addCoinsToTotal(coinInsertedByUser);

        String userContinueYesOrNo = Main.userWishesToContinueOrLeave("yes", coinTotal, priceOfTheUserChoice);

    }

    public static String getProductChoiceFromUser(String productChoice) {
        productChoice = Validator.pickChipsColaOrCandy(productChoice,"TYPE COLA, CHIPS, or CANDY to SELECT");
        return productChoice;
    }

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

    public static Double getChosenItemPrice(String chosenItem) {
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

    public static String userWishesToContinueOrLeave(String userChoiceToContinue, double coinTotal, double priceOfTheUserChoice) {

        userChoiceToContinue = Validator.yesOrNo(userChoiceToContinue);

        if (userChoiceToContinue.equalsIgnoreCase("no")) {
            addAllUserInputtedCoinsToCoinReturn(priceOfTheUserChoice);

        } else if (userChoiceToContinue.equalsIgnoreCase("yes")) {
            double coinReturn = giveChangeBackToUser(coinTotal, priceOfTheUserChoice);
            String totalAmountInDollarFormat = String.format("%.2g%n", coinTotal);
            System.out.println("Okay, you have " + totalAmountInDollarFormat + " left to use.");
        }

        return userChoiceToContinue;

    }

    public static double addAllUserInputtedCoinsToCoinReturn(double userTotal) {
        String coinReturnTotal = String.format("%.2g%n", userTotal);
        System.out.println("Total coin return is: " + coinReturnTotal);
        userTotal = 0.0;

        return userTotal;
    }

    private static double giveChangeBackToUser(double totalCoinsInserted, double itemPriceTotal) {
        double changeToGive = totalCoinsInserted - itemPriceTotal;
        if(changeToGive<0){
            changeToGive = 0;
        }
        String totalAmountInDollarFormat = String.format("%.2g%n", changeToGive);

        System.out.println("Your coinTotal is " + totalAmountInDollarFormat);

        return changeToGive;
    }

}

