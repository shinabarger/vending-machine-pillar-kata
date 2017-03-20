import java.util.Scanner;

public class Main {


    //getUserInput & assign to String userInput
    public static String newCoinFromUser(String args) {

        //declare some variables
        double totalAmountInserted = 0.00;
        double coinReturnTotal = 0.00;

        Scanner scan = new Scanner(System.in);

        //need to replace args with scan.next(); instead of args
        String coinFromUser = args;

        //check to see if coin from user is valid or not using isValidCoin method
        //if not valid, tell the user to try again.
        if (Main.isValidCoin(coinFromUser).equals("not valid")) {
            System.out.println("Sorry, that's not a valid coin. Please enter a valid coin: ");
            coinFromUser = scan.next();
        }

        //if valid, count up on total amount inserted, unless it's a penny.
        //if it's a penny, add 0.01 to the coinreturntotal
        else if (Main.isValidCoin(coinFromUser).equals("valid")) {

            if(coinFromUser.equals("penny")) {
                coinReturnTotal += 0.01;
                System.out.println("Total amount in coin return is: " + coinReturnTotal);
                coinFromUser = Double.toString(coinReturnTotal);

            } else if(coinFromUser.equals("dime")) {

                //TODO add a decimal place to the end of the double so it displays "0.10" not "0.1" to the user
                totalAmountInserted += 0.10;
                System.out.println("Total inserted:  " + totalAmountInserted);
                coinFromUser = Double.toString(totalAmountInserted);
            }

        }


        return coinFromUser;
    }


    public static String isValidCoin(String coin) {
        // write your code here
        if (coin.equals("quarter") | coin.equals("dime") | coin.equals("nickel") | coin.equals("penny")) {
            coin = "valid";
        } else coin = "not valid";
        return coin;
    }

    public static String coinReturnTotal(String coin) {
        if (coin.equals("penny")) {
            double coinReturn = 0.01;
            coin = Double.toString(coinReturn);
        }

        return coin;

    }

    //setup basic testing using junit
    public static int answer() {

        return 42;
    }


}
