import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // we also use the wrapper class Double for storing double datatypes in ArrayList

        ArrayList<Double> prices = new ArrayList<>();
        
        prices.add(99.99);
        prices.add(2000.50);
        prices.add(89.70);

        System.out.println(prices.size());
    }
}
