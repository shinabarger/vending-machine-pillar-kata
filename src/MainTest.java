import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 3/18/17.
 */

public class MainTest {


    @Test
    //returns a string from validator to see if it is a coin
    public void test1() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "quarter";
        String actual = Validator.isValidCoin(scan, "quarter");
        assertEquals(expected, actual);


    }

    @Test
    //returns a string from validator to see if it is a coin
    public void test1_5() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "NO PENNIES. INSERT COIN.";
        String actual = Validator.isValidCoin(scan, "penny");
        assertEquals(expected, actual);


    }

    @Test
    public void test2() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "NOT A COIN";
        String actual = Validator.isValidCoin(scan,"shoelace");
        assertEquals(expected, actual);

    }

    @Test
    public void test3() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "dime";
        String actual = Validator.isValidCoin(scan, "dime");
        assertEquals(expected, actual);

    }

    @Test
    public void test4() throws Exception {
        Scanner scan = new Scanner(System.in);
        String expected = "nickel";
        String actual = Validator.isValidCoin(scan,"nickel");
        assertEquals(expected, actual);

    }


    @Test
    public void test6() throws Exception {
        Scanner scan = new Scanner(System.in);
        Double expected = 0.00;
        Double actual = Main.addCoinsToTotal("penny");
        assertEquals(expected, actual);

    }

    @Test
    public void test7Nickel() throws Exception {
        Double expected = 0.05;
        Double actual = Main.addCoinsToTotal("nickel");
        assertEquals(expected, actual);

    }

    @Test
    public void test8Dime() throws Exception {
        Double expected = 0.10;
        Double actual = Main.addCoinsToTotal("dime");
        assertEquals(expected, actual);

    }


    @Test
    public void test5() throws Exception {
        Scanner scan = new Scanner(System.in);
        Double expected = 0.25;
        Double actual = Main.addCoinsToTotal( "quarter");
        assertEquals(expected, actual);

    }

    @Test
    public void test9Snickers() throws Exception {
        Double expected = 1.00;
        Double actual = Main.chosenItemPrice("cola");
        assertEquals(expected, actual);

    }

    @Test
    public void test10Oreos() throws Exception {
        Double expected = 0.5;
        Double actual = Main.chosenItemPrice("chips");
        assertEquals(expected, actual);

    }

    @Test
    public void test10zingermansreuben() throws Exception {
        Double expected = 0.65;
        Double actual = Main.chosenItemPrice("candy");
        assertEquals(expected, actual);

    }






}