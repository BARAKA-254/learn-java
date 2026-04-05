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
            System.out.println("*********************");
            System.out.print("Place your bet Amount: ");
            bet = scanner.nextInt();

            //  CONFIRM IF BET IF GREATER THAN BALANCE
            if(bet > balance){
                System.out.println("Bet amount cannot be more than the balance!!");
                continue;
            }
            //  CONFIRM IF BET IS GREATER THAN 0
            else if(bet <= 0){
                System.out.println("Bet amount must be greater than 0. ");
                continue;
            }
            //  SUBTRACT BET FROM BALANCE
            else{
                balance -= bet;
            }

            Row = spinRow();

            printRow(Row);

        }
        scanner.close();
        
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE
    }
    // SPIN ROW
    static String[] spinRow(){
        Random random = new Random();

        String[] symbols = {"🍒", "🍉", "🍋", "⭐", "🔔"};
            
        String [] row = new String[3];
            
        for(int i = 0; i < row.length; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
            
        return row;
    }
    // PRINT ROW
    static void printRow(String[] Row){

        System.out.println(" " + String.join(" | ", Row));
    }

}