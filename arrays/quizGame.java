import java.security.Guard;
import java.util.Scanner;

class quizGame{
    public static void main(String [] args){

        // array of questions
        String[] questions = {  "1. What is the main function of a router?: ", 
                                "2. Which part of the computer is considered the brain?: ", 
                                "3. What year was facebook launced?: ", 
                                "4. Who is known as the father of computers?: ", 
                                "5. What was the first programming language?: "
                            };

        // 2 D array of options
         
        String[][] options = {{"A. Storing Files","B. Encrypting data", "C. Directing internet traffic", "D. Managing Passwords"},   
                              {"A. CPU ","B. RAM ", "C. HARD DRIVE", "D. GPU "},
                              {"A. 2000","B. 2004", "C. 2006", "D. 2008"},
                              {"A. Steve Jobs","B. Bill Gates", "C. Alan Turing", "D. Charles Babbage"},
                              {"A. C","B. COBOL", "C. FORTRAN", "D. ASSEMBLY"}
                             };
                            
        String [] correctChoices = {"C", "A", "B", "D", "C" };
        double score = 0;
        String guess;
        double percentageScore;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            
            for(int j = 0 ; j < options[i].length; j++ ){

                System.out.println(options[i][j]);
            }

            System.out.print("ANSWER: ");
            guess = scanner.nextLine().toUpperCase();

            if(!guess.equals("A") && !guess.equals("B") && !guess.equals("C") && !guess.equals("D")){
                System.out.println("INVALID CHOICE");
            }

            else if(guess.equals(correctChoices[i])){
                System.out.println("CORRECT!!");
                score++;
            }
            else{
                System.out.println("INCORRECT!! the answer is " + correctChoices[i]);
            }
            
        }
        System.out.println("TEST COMPLETE");
        System.out.println("You scored " + score + " out of " + questions.length);
        
        percentageScore = (score/5)*100;

        System.out.printf("PERCENTAGE SCORE: %f  \n",percentageScore);

        scanner.close();
    }
}

