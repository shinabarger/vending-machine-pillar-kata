import java.util.Scanner;

//Validators for entire program

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

    public static String pickProduct(Scanner scan, String prompt) {
        double coinReturn = 0.00;
        System.out.print(prompt);
        String s = scan.nextLine();// read user entry

        boolean isValid = false;
        while (!isValid) {
            if (s.equalsIgnoreCase("chips")
                    | s.equalsIgnoreCase("cola")
                    | s.equalsIgnoreCase("candy")
                    ) {
                isValid = true;
                break;

            } else {
                System.out.println("INVALID CHOICE. TRY AGAIN");
                s = scan.nextLine();
            }
        }

        return s;
    }

    public static String yesOrNo(Scanner scan, String s) {

        boolean isValid = false;

        while(!isValid) {
            if (!s.equalsIgnoreCase("y")) {
                System.out.println("WRONG. That doesn't work. Try again");
                s = scan.nextLine();
                scan.next();
            } else if (s.equalsIgnoreCase("y") | s.equalsIgnoreCase("n")) {
                isValid = true;
            }
        }

        return s;
    }

}



