// import array class
import java.util.Arrays;

public class arrayClass{
    public static void main(String [] args){

        String [] fruits = {"banana", "orange", "pineapple", "apple", "pear", "mango"};

        Arrays.sort(fruits);

        // enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}