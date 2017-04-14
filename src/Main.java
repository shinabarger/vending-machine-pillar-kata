import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by David Shinabarger March 2017
 * Pillar Kata for Apprenticeship Program
 * You can view the instructions for the program in the README.md
 */

public class Main {

    public static void main(String args) {

        String userProductChoice = getProductChoiceFromUser("Cola");

        double priceOfTheUserChoice = getChosenItemPrice(userProductChoice);

        String coinInsertedByUser = Validator.isValidCoin(args);

        //add Coins to Total
        double total = addCoinsToTotal(coinInsertedByUser);

        String userContinueYesOrNo = Main.userWishesToContinueOrLeave("yes");

        if (userContinueYesOrNo.equalsIgnoreCase("no")) {
            addAllUserInputtedCoinsToCoinReturn(priceOfTheUserChoice);

        } else if (userContinueYesOrNo.equalsIgnoreCase("yes")) {
            double coinReturn = (total - priceOfTheUserChoice);
            String totalAmountInDollarFormat = String.format("%.2g%n", coinReturn);
            System.out.println("Your total is " + totalAmountInDollarFormat);
            total = 0.00;

        } else {
            total = priceOfTheUserChoice - total;

            if (total < 0) {
                total = 0.0;
            }
            String totalAmountInDollarFormat = String.format("%.2g%n", total);
            System.out.println("Okay, you have " + totalAmountInDollarFormat + " left to use.");
        }

    }

    public static String getProductChoiceFromUser(String productChoice) {
        Validator.pickChipsColaOrCandy("TYPE COLA, CHIPS, or CANDY to SELECT");
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

    public static String userWishesToContinueOrLeave(String userChoiceToContinue) {

        userChoiceToContinue = Validator.yesOrNo(userChoiceToContinue);

        return userChoiceToContinue;

    }

    public static double addAllUserInputtedCoinsToCoinReturn(double userTotal) {
        String coinReturnTotal = String.format("%.2g%n", userTotal);
        System.out.println("Total coin return is: " + coinReturnTotal);
        userTotal = 0.0;

        return userTotal;
    }

}

