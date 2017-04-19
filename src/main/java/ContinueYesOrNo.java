package main.java;

/**
 * Created by davidshinabarger on 4/19/17.
 */
public class ContinueYesOrNo {


    public static String userWishesToContinueOrLeave(String userChoiceToContinue, double coinTotal, double priceOfTheUserChoice) {

        userChoiceToContinue = Validator.yesOrNo(userChoiceToContinue);

        if (userChoiceToContinue.equalsIgnoreCase("no")) {
            CoinReturn.addAllUserInputtedCoinsToCoinReturn(priceOfTheUserChoice);

        } else if (userChoiceToContinue.equalsIgnoreCase("yes")) {
            double coinReturn = CoinReturn.giveChangeBackToUser(coinTotal, priceOfTheUserChoice);
            String totalAmountInDollarFormat = String.format("%.2g%n", coinTotal);
            System.out.println("Okay, you have " + totalAmountInDollarFormat + " left to use.");
        }

        return userChoiceToContinue;

    }
}
