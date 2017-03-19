import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 3/18/17.
 */

public class MainTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Main.answer();
        assertEquals(expected, actual);
    }

    @Test
    //returns a string from validator to see if it is a coin
    public void test1() throws Exception {
        String expected = "valid";
        String actual = Main.isValidCoin("quarter");
        assertEquals(expected, actual);


    }

    @Test
    public void test2() throws Exception {
        String expected = "not valid";
        String actual = Main.isValidCoin("shoelace");
        assertEquals(expected, actual);

    }

    @Test
    public void test3() throws Exception {
        String expected = "valid";
        String actual = Main.isValidCoin("dime");
        assertEquals(expected, actual);

    }

    @Test
    public void test4() throws Exception {
        String expected = "valid";
        String actual = Main.isValidCoin("nickel");
        assertEquals(expected, actual);

    }

    @Test
    public void test5() throws Exception {
        String expected = "0.01";
        String actual = Main.coinReturnTotal("penny");
        assertEquals(expected, actual);

    }






}