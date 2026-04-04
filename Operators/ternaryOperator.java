public class ternaryOperator{
    public static void main(String [] args){
         
        //ternary operator ? return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;


        int score = 70;
        
        /* 
            //check if I pass or fail using if statements
        if(score >= 60 ){
            System.out.println("PASS"); 
        }
        else{
            System.out.println("FAIL");
        }
         
        */
       // the same code can be rewritten as
       String passOrFail = (score >= 70) ? "PASS" : "FAIL";
       System.out.println(passOrFail);
    }
}