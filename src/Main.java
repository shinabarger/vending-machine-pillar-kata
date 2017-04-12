import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by David Shinabarger March 2017
 * Pillar Kata for Apprenticeship Program
 * You can view the instructions for the program in the README.md
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double total = 0;
        String userInputCoin;
        String totalAmount = "0.00";
        double coinReturn = 0.00;
        String answer = "";
        double choicePriceDouble = 0.0;

        do {
            String userProductChoice = Validator.pickChipsColaOrCandy("TYPE COLA, CHIPS, or CANDY to SELECT");

            //get price of product
            choicePriceDouble = chosenItemPrice(userProductChoice);
            String choicePrice = String.format("%.2g%n", choicePriceDouble);

            System.out.println(userProductChoice + " costs " + choicePrice + "\nTotal inserted is: " + totalAmount);

            do {
                //validate if it is a coin
                System.out.println("INSERT COIN");
                String userInput = scan.next();
                userInputCoin = Validator.isValidCoin(userInput);

                //add Coins to Total
                total += addCoinsToTotal(userInputCoin);
                totalAmount = String.format("%.2g%n", total);
                System.out.println(userProductChoice + " costs " + choicePrice + "\nTotal inserted is: " + totalAmount);

            } while (choicePriceDouble > total);

            //ask user if they want to purchase or cancel the order before it processes

            System.out.println("Press N to cancel order completely, anything else to continue.");
            answer = scan.nextLine();
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                coinReturn = choicePriceDouble;
                choicePriceDouble = 0.0;
                choicePrice = String.format("%.2g%n", choicePriceDouble);
                String coinReturnTotal = String.format("%.2g%n", coinReturn);
                System.out.println("Total coin return is: " + coinReturnTotal);
            } else if (!answer.equalsIgnoreCase("n")) {

                System.out.println("YOUR PRODUCT WAS DISPENSED \nTHANK YOU \n");

                System.out.println("Would you like your remaining coins returned? Type yes or no.");
                answer = scan.nextLine();

                if (answer.equalsIgnoreCase("y") | answer.equalsIgnoreCase("Yes")) {
                    coinReturn = (total - choicePriceDouble);
                    totalAmount = String.format("%.2g%n", coinReturn);
                    total = 0.00;
                    System.out.println("Don't forget your coins in coin return: " + totalAmount);
                } else {
                    total = choicePriceDouble - total;

                    if (total < 0) {
                        total = 0.0;
                    }
                    totalAmount = String.format("%.2g%n", total);
                    System.out.println("Okay, you have " + totalAmount + " left to use.");
                }

            }

            System.out.println("Would you like to purchase something else? #2");
            answer = scan.nextLine();
        } while (answer.equalsIgnoreCase("Y") | answer.equalsIgnoreCase("yes"));

        System.out.println("Goodbye.");

    }

    //getUserInput & assign to String userInput
    public static Double addCoinsToTotal(String coinInput) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner scan = new Scanner(System.in);

        //declare some variables
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
        }
        switch (chosenItem.toLowerCase()) {
            case "chips":
                priceOfItem += 0.50;

                break;
        }
        switch (chosenItem.toLowerCase()) {
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

}

//TODO