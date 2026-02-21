import java.util.Scanner;

class commonScannerIssues {
    public static void main(String[] args){

        /*When accepting user input of the datatype String immediately after accepting int or double 
        there is an error because the a newline character is automatically accepted into our string.
        To prevent such, introduce a nextString method immediately after the nextInt without assigning
        it to any variable*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        // the line below has to be present for the name string below it to be accepted
        scanner.nextLine();
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". You are " + age + " years old");

        scanner.close();
    }
}