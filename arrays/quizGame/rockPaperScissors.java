import java.util.Scanner;
import java.util.Random;

class rockPaperScissors{
    public static void main(String [] args){

        String userInput;
        char userChoice;
        char computerChoice;
        boolean playAgain = true; 
        char chooseToPlayAgain;

        
        
        System.out.println("*********************************");
        System.out.println("  ROCK ​🪨 | PAPER 🗞️​ | SCISSORS ✂️ ");
        System.out.println("*********************************");

        Scanner scanner = new Scanner(System.in);
        do{
                    
           
            System.out.print("SELECT ONE OF THE FOLLOWING CHOICES: ROCK, PAPER, SCISSORS: ");
            userInput=  scanner.nextLine();

        
            userChoice = returnUserChoiceSymbol(userInput);
            computerChoice = returnComputerChoiceSymbol();

            if(computerChoice == userChoice){
                System.out.println("DRAW!!");
            }
            else if(userChoice == 'R' && computerChoice == 'S' || userChoice == 'P' && computerChoice == 'R' || userChoice == 'S' && computerChoice == 'P' ){

                System.out.println("COMPUTER CHOICE: " +   computerChoice );
                System.out.println("YOU WIN!! ");
            }
            else{
                System.out.println("COMPUTER CHOICE: " + computerChoice);
                System.out.println("YOU LOSE!!");
            }

            System.out.print("Would you like to play again: (Y/N): ");

            chooseToPlayAgain = scanner.next().toUpperCase().charAt(0);

            if(chooseToPlayAgain == 'N'){
                playAgain = false;
            }
            else{
                playAgain = true;
            }


        }while (playAgain == true);


        scanner.close();
    }

    static char returnUserChoiceSymbol(String userInput){
        return userInput.charAt(0);
    }

    static char returnComputerChoiceSymbol(){
        Random random = new Random();

        int randomComputerChoice = random.nextInt(3);

        if(randomComputerChoice == 0){
            return 'R';
        }
        else if(randomComputerChoice == 1){
            return 'P';
        }
        else{
            return 'S';
        }
    }
}