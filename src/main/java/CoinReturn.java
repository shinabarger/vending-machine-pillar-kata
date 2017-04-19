package main.java;

/**
 * Created by davidshinabarger on 4/19/17.
 */
public class CoinReturn {
    public static String coinReturnTotal(String coin) {
        if (coin.equals("penny")) {
            double coinReturn = 0.01;

            coin = Double.toString(coinReturn);
        }
        return coin;

    }

    public static double addAllUserInputtedCoinsToCoinReturn(double userTotal) {
        String coinReturnTotal = String.format("%.2g%n", userTotal);
        System.out.println("Total coin return is: " + coinReturnTotal);
        userTotal = 0.0;

        return userTotal;
    }

    static double giveChangeBackToUser(double totalCoinsInserted, double itemPriceTotal) {
        double changeToGive = totalCoinsInserted - itemPriceTotal;
        if (changeToGive < 0) {
            changeToGive = 0;
        }
        String totalAmountInDollarFormat = String.format("%.2g%n", changeToGive);

        System.out.println("Your coinTotal is " + totalAmountInDollarFormat);

        return changeToGive;
    }
}

