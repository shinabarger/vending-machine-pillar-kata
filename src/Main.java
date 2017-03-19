public class Main {

    //setup basic testing using junit
    public static int answer() {

        return 42;
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


}
