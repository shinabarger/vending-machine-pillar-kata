package main.java;

public class Validator {

    public static String isValidCoin(String itemInsertedIntoSlot) {
        double coinReturn = 0.00;
        String validatingMessage = "";
        if (itemInsertedIntoSlot.equalsIgnoreCase("penny")) {
            validatingMessage = "NO PENNIES. INSERT COIN.";
            coinReturn += 0.01;

        } else if (!itemInsertedIntoSlot.equalsIgnoreCase("dime")
                & !itemInsertedIntoSlot.equalsIgnoreCase("quarter")
                & !itemInsertedIntoSlot.equalsIgnoreCase("nickel")) {
            validatingMessage = "That wasn't a coin. INSERT COIN";
        } else {
            validatingMessage = itemInsertedIntoSlot;
        }

        if (coinReturn > 0) {
            System.out.println("Amount in coin return is: " + coinReturn + ", please take your coin");
        }

        return validatingMessage;
    }

    public static String pickChipsColaOrCandy(String userChoice, String prompt) {
        System.out.println(prompt);

        if (userChoice.equalsIgnoreCase("chips")
                | userChoice.equalsIgnoreCase("cola")
                | userChoice.equalsIgnoreCase("candy")
                ) {
            return userChoice;
        } else return "invalid";
    }

    public static String yesOrNo(String choiceToContinue) {

        if (choiceToContinue.equalsIgnoreCase("yes") | choiceToContinue.equalsIgnoreCase("no")) {
            return choiceToContinue;
        } else return "not yes or no.";

    }

}
