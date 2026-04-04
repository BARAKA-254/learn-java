import java.util.Scanner;
import java.util.Random;

public class diceRollingGame{
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("How many die would you like to roll: ");
        int noOfRolls = scanner.nextInt();
 
        if(noOfRolls < 0 ){
            System.out.println("No of rolls can't be negative. ");
        }
        else{

            for(int i = 0; i < noOfRolls; i++ ){
                int roll = random.nextInt(1,7);
                System.out.println("You rolled: " + roll);
                printDie(roll);
            }
        
        }
        
    }
    static void printDie(int roll){
        String die1 = ("""
                            _________
                            |       |
                            |   *   |
                            |_______|
                                                
                         """
                        );
      

        String die2 = ("""
                            _________
                            |*      |
                            |       |
                            |______*|
                         """ 
                        );
    

        String die3 =("""
                            _________
                            |*      |
                            |   *   |
                            |______*|
                         """ 
                        );
    
        
        String die4 = ("""
                            _________
                            |*     *|
                            |       |
                            |*_____*|
                         """ 
                            );
    
        String die5 = ("""
                            _________
                            |*     *|
                            |   *   |
                            |*_____*|
                         """ 
                            );
    
        String die6 = ("""
                            _________
                            |*     *|
                            |*     *|
                            |*_____*|
                         """ 
                            );

        switch(roll){
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);
        }
    }

}