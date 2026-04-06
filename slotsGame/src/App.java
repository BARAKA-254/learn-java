import java.util.Scanner;
import java.util.Random;

public class App{
    public static void main(String [] args){


        // JAVA SLOT MACHINE
        // DECLARE VARIABLES
        double balance = 100;
        double bet;
        double payout;
        String[] Row;

        // WELCOME MESSAGE
        System.out.println("********************************************");
        System.out.println("WELCOME TO JAVA SLOT MACHINE. 🍒 🍉 🍋 🔔 ⭐");
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

            payout = getPayout(Row,bet);
            if(payout > 0){
                System.out.println("CONGRATULATIONS YOU WON!! " + payout);
                balance += payout;
            }
            else{
                System.out.println("SORRY YOU LOST!!. TRY AGAIN!! ");
            }

            // ASK TO PLAY AGAIN 
            System.out.println("Would you like to play again?(Y/N): ");
            
            String playAgain = scanner.next().toUpperCase();
            if(playAgain.equals("Y")){
                continue;
            }
            else{
                // DISPLAY EXIT MESSAGE
                System.out.println("BYE!!");
                break;
            }

        }
        scanner.close();       
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
    // GET PAYOUT
    static double getPayout(String[] Row, double bet){

        if(Row[0].equals(Row[1]) && Row[1].equals(Row[2])){

            return switch(Row[0]){
                case "🍒" ->  bet * 3;
                case "🍉" ->  bet * 4;
                case "🍋" ->  bet * 5;
                case "🔔" ->  bet * 6;
                case "⭐" ->  bet * 7;

                default -> 0;
            };    
        }
        else if(Row[0].equals(Row[1]) || Row[1].equals(Row[2])){
            
            return switch(Row[1]){
                case "🍒" ->  bet * 2;
                case "🍉" ->  bet * 3;
                case "🍋" ->  bet * 4;
                case "🔔" ->  bet * 5;
                case "⭐" ->  bet * 6;
                default -> 0;
            };
        }
        return 0;
   
    }
   
}