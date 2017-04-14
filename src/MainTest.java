import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 3/18/17.
 */

public class MainTest {

    @Test
    //returns a string from validator to see if it is a coin
    public void quarterReturnsQuarter() throws Exception {
        String expected = "quarter";
        String actual = Validator.isValidCoin("quarter");
        assertEquals(expected, actual);

    }

    @Test
    //returns a string from validator to see if it is a coin
    public void pennyReturnsErrorMessageInValidator() throws Exception {
        String expected = "NO PENNIES. INSERT COIN.";
        String actual = Validator.isValidCoin("penny");
        assertEquals(expected, actual);

    }

    @Test
    public void aNonCurrencyItemReturnsErrorMessageInValidator() throws Exception {
        String expected = "That wasn't a coin. INSERT COIN";
        String actual = Validator.isValidCoin("shoelace");
        assertEquals(expected, actual);

    }

    @Test
    public void dimeReturnsDimeInValidator() throws Exception {
        String expected = "dime";
        String actual = Validator.isValidCoin("dime");
        assertEquals(expected, actual);

    }

    @Test
    public void nickelReturnsNickelInValidator() throws Exception {
        String expected = "nickel";
        String actual = Validator.isValidCoin("nickel");
        assertEquals(expected, actual);

    }

    @Test
    public void pennyAddsNothingToInsertedCoinTotal() throws Exception {
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
        Double expected = 0.25;
        Double actual = Main.addCoinsToTotal("quarter");
        assertEquals(expected, actual);

    }

    @Test
    public void colaReturnsCorrectItemPriceOf1Dollar() throws Exception {
        Double expected = 1.00;
        Double actual = Main.getChosenItemPrice("cola");
        assertEquals(expected, actual);

    }

    @Test
    public void chipsReturnsCorrectItemPriceOf50cents() throws Exception {
        Double expected = 0.5;
        Double actual = Main.getChosenItemPrice("chips");
        assertEquals(expected, actual);

    }

    @Test
    public void candyReturnsCorrectItemPriceOf65Cents() throws Exception {
        Double expected = 0.65;
        Double actual = Main.getChosenItemPrice("candy");
        assertEquals(expected, actual);

    }

    @Test
    public void whenUserSelectsChipsItValidatesCorrectlyToChips() throws Exception {
        String expected = "chips";
        String actual = Validator.pickChipsColaOrCandy("chips", "prompt");
        assertEquals(expected, actual);
    }

    @Test
    public void whenUserSelectsColaValidatorValidatesAndReturnsCola() throws Exception {
        String expected = "cola";
        String actual = Validator.pickChipsColaOrCandy("cola", "prompt");
        assertEquals(expected, actual);
    }

    @Test
    public void whenCandyIsSelectedItIsAValidChoice() throws Exception {
        String expected = "candy";
        String actual = Validator.pickChipsColaOrCandy("candy", "prompt");
        assertEquals(expected, actual);
    }

    @Test
    public void whenOreoIsSelectedValidatorReturnsInvalid() throws Exception {
        String expected = "invalid";
        String actual = Validator.pickChipsColaOrCandy("oreo", "prompt");
        assertEquals(expected, actual);
    }

    @Test
    public void didUserContinueEqualYes() throws Exception {
        String expected = "yes";
        String actual = Validator.yesOrNo("yes");
        assertEquals(expected, actual);
    }

    @Test
    public void didUserContinueEqualNo() throws Exception {
        String expected = "no";
        String actual = Validator.yesOrNo("no");
        assertEquals(expected, actual);
    }

    @Test
    public void didAnythingElseReturnErrorMessage() throws Exception {
        String expected = "not yes or no.";
        String actual = Validator.yesOrNo("anything else");
        assertEquals(expected, actual);
    }

    @Test
    public void didUserContinueEqualYesInMain() throws Exception {
        String expected = "yes";
        String actual = Main.userWishesToContinueOrLeave("yes");
        assertEquals(expected, actual);
    }

    @Test
    public void userSaidNoToCancelProductReturnedNo() throws Exception {
        String expected = "no";
        String actual = Main.userWishesToContinueOrLeave("no");
        assertEquals(expected, actual);
    }

    @Test
    public void whenUserCancelsOrderAddsDollarToCoinReturn() throws Exception {
        double expected = 0.0;
        double actual = Main.addAllUserInputtedCoinsToCoinReturn(0.0);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getColaWhenUserInputCola() throws Exception {
       String expected = "cola";
        String actual = Main.getProductChoiceFromUser("cola");
        assertEquals(expected, actual);
    }

    @Test
    public void getInvalidMessageWhenUserSelectsOrea() throws Exception {
        String expected = "invalid";
        String actual = Main.getProductChoiceFromUser("oreo");
        assertEquals(expected, actual);
    }



}