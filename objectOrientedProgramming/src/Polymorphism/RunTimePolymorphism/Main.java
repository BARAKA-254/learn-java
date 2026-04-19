import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //Runtime Polymorphism  =   When the method that gets executed is decided at runtime, 
        //                          based on the actual type of the object
        //                          also known as dynamic polymorphism

        Animal animal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which animal would you like (1.Dog, 2.Cat)?: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();

            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();

            animal.speak();
        }
        else{
            System.out.println("Invalid Input.");
        }

        scanner.close();

    }
}