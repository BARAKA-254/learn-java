import java.util.Scanner;

public class methods{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your new Age: ");
        int age = scanner.nextInt();

        birthdaySong(name, age);
        scanner.close();
    }

    public static void birthdaySong(String myName, int newAge){
        System.out.println("Happy birthday to you. ");
        System.out.println("Happy birthday to you ");
        System.out.println("Happy birthday dear "+ myName);
        System.out.println("Happy birthday to you.\n");

        System.out.println("Congratulations, you are "+ newAge + " years old");
    }
}