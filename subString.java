import java.util.Scanner;

class subString{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        String domain = email.substring(email.indexOf("@") + 1);
        String username = email.substring(0,email.indexOf("@"));


        System.out.println("Email: "+ email);
        System.out.println("Username: "+ username);
        System.out.println("Domain: "+ domain);
        
        scanner.close();
    }
}