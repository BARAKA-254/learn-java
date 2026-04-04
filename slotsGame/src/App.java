import java.util.Scanner;
import java.util.Random;

public class App{
    public static void main(String [] args){


        // JAVA SLOT MACHINE
        // DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] Row;

        // WELCOME MESSAGE
        System.out.println("********************************************");
        System.out.println("WELCOME TO JAVA SLOT MACHINE. 🍒 🍉 🍋 ⭐ 🔔");
        System.out.println("********************************************");


        Scanner scanner  = new Scanner(System.in);
        // DISPLAY BALANCE
        while(balance > 0){
            System.out.println("Your Balance is " + balance);

            // PLACE BET
            System.out.println("Place your bet: ");
            bet = scanner.nextInt();

            //  CONFIRM IF BET IF GREATER THAN BALANCE
            if(bet > balance){
                System.out.println("Bet amount cannot be more than the balance!!");
                continue;
            }
            //  CONFIRM IF BET IS GREATER THAN 0
            else if(bet >= 0){
                System.out.println("Bet amount must be greater than 0. ");
                continue;
            }
            //  SUBTRACT BET FROM BALANCE
            else{
                balance -= bet;
            }

            spinRow();

        }
        
        // SPIN ROW
        
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE
    }
}