package main.java;

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

        userProductChoice = GetProductChoice.getProductChoiceFromUser("Cola");

        priceOfTheUserChoice = GetPrice.getChosenItemPrice(userProductChoice);

        coinInsertedByUser = Validator.isValidCoin(String.valueOf(args));

        coinTotal = AddCoins.addCoinsToTotal(coinInsertedByUser);

        String userContinueYesOrNo = ContinueYesOrNo.userWishesToContinueOrLeave("yes", coinTotal, priceOfTheUserChoice);

    }

}





