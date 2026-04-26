import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your Age: ");
            int Age = scanner.nextInt();

            System.out.println("Hello " + name);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        // the finally block always executes
        finally{
            scanner.close();
        }   
    }
}
