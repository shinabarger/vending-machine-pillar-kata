package main.java;

/**
 * Created by davidshinabarger on 4/19/17.
 */
public class GetProductChoice {

    public static String getProductChoiceFromUser(String productChoice) {
        productChoice = Validator.pickChipsColaOrCandy(productChoice, "TYPE COLA, CHIPS, or CANDY to SELECT");
        return productChoice;
    }

}
