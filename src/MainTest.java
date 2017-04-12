import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 3/18/17.
 */

public class MainTest {


    @Test
    //returns a string from validator to see if it is a coin
    public void quarterReturnsQuarter() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "quarter";
        String actual = Validator.isValidCoin(scan, "quarter");
        assertEquals(expected, actual);


    }

    @Test
    //returns a string from validator to see if it is a coin
    public void pennyReturnsErrorMessageInValidator() throws Exception {
        //TODO make these tests work even with the scanning built into the validation
        Scanner scan = new Scanner(System.in);
        String expected = "NO PENNIES. INSERT COIN.";
        String actual = Validator.isValidCoin(scan, "penny");
        assertEquals(expected, actual);


    }

    @Test
    public void aNonCurrencyItemReturnsErrorMessageInValidator() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "That wasn't a coin. INSERT COIN";
        String actual = Validator.isValidCoin(scan,"shoelace");
        assertEquals(expected, actual);

    }

    @Test
    public void dimeReturnsDimeInValidator() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "dime";
        String actual = Validator.isValidCoin(scan, "dime");
        assertEquals(expected, actual);

    }

    @Test
    public void nickelReturnsNickelInValidator() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "nickel";
        String actual = Validator.isValidCoin(scan,"nickel");
        assertEquals(expected, actual);

    }


    @Test
    public void pennyAddsNothingToInsertedCoinTotal() throws Exception {
        Scanner scan = new Scanner(System.in);
        Double expected = 0.00;
        Double actual = Main.addCoinsToTotal("penny");
        assertEquals(expected, actual);

    }

    @Test
    public void nickelAddsFiveCentsToInsertedCoinTotal() throws Exception {
        Double expected = 0.05;
        Double actual = Main.addCoinsToTotal("nickel");
        assertEquals(expected, actual);

    }

    @Test
    public void dimeAddsTenCentsToInsertedCoinTotal() throws Exception {
        Double expected = 0.10;
        Double actual = Main.addCoinsToTotal("dime");
        assertEquals(expected, actual);

    }


    @Test
    public void quarterAdds25CentsToInsertedCoinTotal() throws Exception {
        Scanner scan = new Scanner(System.in);
        Double expected = 0.25;
        Double actual = Main.addCoinsToTotal( "quarter");
        assertEquals(expected, actual);

    }

    @Test
    public void colaReturnsCorrectItemPriceOf1Dollar() throws Exception {
        Double expected = 1.00;
        Double actual = Main.chosenItemPrice("cola");
        assertEquals(expected, actual);

    }

    @Test
    public void chipsReturnsCorrectItemPriceOf50cents() throws Exception {
        Double expected = 0.5;
        Double actual = Main.chosenItemPrice("chips");
        assertEquals(expected, actual);

    }

    @Test
    public void candyReturnsCorrectItemPriceOf65Cents() throws Exception {
        Double expected = 0.65;
        Double actual = Main.chosenItemPrice("candy");
        assertEquals(expected, actual);

    }






}