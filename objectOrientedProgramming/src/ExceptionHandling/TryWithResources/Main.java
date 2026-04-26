import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your ID Number: ");
            int idNo = scanner.nextInt();

        }catch (InputMismatchException e){
            System.out.println("That wasn't a Number ");
        
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong!!");
        }
    }
}
