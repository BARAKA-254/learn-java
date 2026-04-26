import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Menu ordering Program

        // declare an arraylist named order
        ArrayList order = new ArrayList<>();
        String choice = " ";

        //
        Scanner scanner = new Scanner(System.in);
        
            // prompt the user for new input as long as the haven't quit
            while (!choice.equals("Q")) {
                System.out.print("Enter food item (press Q to quit): ");
                choice = scanner.nextLine().toUpperCase();

                order.add(choice);
            }
        
        
        // remove the last item from the arraylist since it's the Q for quit operation
        order.remove(order.size() - 1);
        System.out.println("Your Order: " + order);

        
        scanner.close();
    }
}
