// import scanner for accepting user inpput
import java.util.Scanner;

public class Variables{
    public static void main(String[] args){

        // Variables = container for a value
        // Java has two types of variables (Primitive and Reference)
        // Primitive = stored directly in memory(stack ds) ->int, double, char, boolean
        // Reference = memory address (stack) that points to (heap) [pointers involved] -> string,array,object


        // varible declaration and initialization

        
        int age ;
        String userName;
        String firstName;
        String secondName;
        double myGpa;
        int myYearOfStudy = 2;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name username: ");

        userName = scanner.nextLine();

        System.out.print("Hello " + userName + "\n");

        System.out.print("Enter the following details: \n");

        System.out.print("First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Second Name: ");
        secondName = scanner.nextLine();

        System.out.print("AGE: ");
        age = scanner.nextInt();

        System.out.print("GPA: ");
        myGpa = scanner.nextDouble();

        scanner.close();


        if(myYearOfStudy <= 4 && myYearOfStudy >=1){
            isStudent = true;
        }
        else{
            isStudent = false;
        }
        

        
        
        String myData = "\nName: " + firstName + " " + secondName + "\nage: " + age + "\nGPA: " + myGpa;

        if(isStudent){
            System.out.println(myData);

            if(myGpa >= 8){
                System.out.println("You Passed!");
            }
            else{
                System.out.println("You Failed!");
            }
        }
        else{
            System.out.println("You are not a registered student.");
        }
        

    }
}