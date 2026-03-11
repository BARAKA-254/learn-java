import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame{
    public static void main(String[] args){


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Guessing Game ");
        System.out.println("Enter a Range of guessing");
        System.out.print("Minimum Number: ");
        int min = scanner.nextInt();
        System.out.print("Maximum Number: ");
        int max = scanner.nextInt();
    
        int randomNumber = random.nextInt(min,max+1); 
        int guess = 0;
        int guesses = 0;
        do{
            System.out.print("Enter a number between " + min + "- " + max + " :");
            guess = scanner.nextInt();
            
            if(guess < randomNumber){
                System.out.println("Too Low!! Try Again.");
            }
            else if(guess > randomNumber){
                System.out.println("Too High!! Try Again.");
            }
            else{
                System.out.println("Correct!! the number is: " + randomNumber);
                System.out.println("Number of gueses: " + guesses);
            }


            guesses++;
        }while(randomNumber != guess);
        
        scanner.close();
    }

}