import java.util.Scanner;

class quizGame2{
    public static void main(String[] args){

        String[]  questions ={  "1. What is the main funtion of a Router? ",
                                "2. Which part of the computer is considered the brain? ",
                                "3. What keyword(s) is used to declare a constant in java? ",
                                "4. Which one of the following is not a datatype in java? ",
                                "5. What is an array? "
                            };
        String [][] options ={
                                {"A. Secure Data", "B. Direct internet traffic", "C. Encrypt Data", "D.Store Data"},
                                {"A. CPU ", "B. MotherBoard", "C. GPU", "SSD"},
                                {"A. Const", "B.Constant", "C. Static Final", "D. Static Constant"},
                                {"A. Int", "B. Boolean", "C. Number", "D. Char"},
                                {"A. Keyword", "B. DataType", "C. Algorithm", "D. Data Structure"}
                            };
        
        Scanner scanner =  new Scanner(System.in);
        String[] correctAnswers = {"B","A","C","C","D"};
        int score = 0;
        String guess;

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(int j = 0; j < options[i].length; j++){

                System.out.println(options[i][j]);
            }

            System.out.print("ANSWER: ");
            guess =  scanner.nextLine().toUpperCase();

            if(!guess.equals("A") && !guess.equals("B") && !guess.equals("C") && !guess.equals("D")){
                System.out.println("INVALID INPUT!!");

            }
            else if(guess.equals(correctAnswers[i])){
                System.out.println("CORRECT!!");
                score++;
            }
            else{
                System.out.println("INCORRECT!!! the answer is " + correctAnswers[i]);
            }
        }

        System.out.println("YOUR SCORE IS " + score + " OUT OF " + questions.length);

        scanner.close();
    }
}