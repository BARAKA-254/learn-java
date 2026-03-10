import java.util.Scanner;

public class conditionalOperators{
    public static void main(String [] args){

        // username verifier
        // username must be longer than 4 words and not more than 12 words
        // username shouldn't have spaces or underscores

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if(username.contains(" " )|| username.contains("_")){
            System.out.println("Invalid Username!!");
            System.out.println("Username cannot contain a space( ) or underscore(_)");
        }
        else if(username.length() < 4  || username.length() > 12){
            System.out.println("Invalid Username!!");
            if(username.length() < 4){
                System.out.println("Username cannot be less than 4 characters long");
            }
            else if(username.length() > 12){
                System.out.println("Username cannot be more than 12 characters long. ");
            }
        }
        
        else{
            System.out.println("Username: " + username);
        }

    }
}