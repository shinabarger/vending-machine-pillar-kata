package main.java;

/**
 * Created by davidshinabarger on 4/19/17.
 */
public class GetPrice {

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
}
