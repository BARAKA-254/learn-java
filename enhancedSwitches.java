import java.util.Scanner;

public class enhancedSwitches {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        String day = scanner.nextLine().toUpperCase();

        scanner.close();

        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                
                System.out.println("It is a WEEKDAY!! \nGET TO WORK");
                
            case "SATURDAY", "SUNDAY" ->
                System.out.println("It is a WEEKEND. No work Today");
        
            default -> System.out.println("Invalid input");
    
        }
    }
}