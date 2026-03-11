import java.util.Scanner;

public class whileLoops{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        String username = "";

        while(username==""){
            System.out.print("Enter your username: ");
            username = scanner.nextLine();
        }
        System.out.println("Hello " + username);
    }
}