import java.util.ArrayList;
import java.util.Collections;

public class Fruits {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");
         
        System.out.println(fruits);

        // get method to return the element at the index passed into the method
        String first = fruits.get(0);
        System.out.println(first);

        // remove method to remove the element at the specified index
        fruits.remove(0);
        System.out.println(fruits);
        fruits.add("Orange");

        // set method replaces the item in the specified index with the other one passed withing the method
        fruits.set(0, "Pineapple");
        System.out.println(fruits);

        // sort the elements
        System.out.println("\nUnsorted: " + fruits);
        Collections.sort(fruits);
        System.out.println("Sorted  : " + fruits);

    }
}
