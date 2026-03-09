import java.util.Scanner;

public class calculator{
    public static void main(String [] args){

        double num1;
        double num2;
        double result;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter Number 2: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+,-,*,/): ");
        operator = scanner.next();

        scanner.close();

        switch (operator) {
            case "+" ->
                System.out.println(num1+num1);
            
            case "-" ->
                System.out.println(num1-num2);
            
            case "*" ->
                System.out.println(num1*num2);
            
            case "/" ->
                System.out.println(num1/num2);
        
            default ->
                System.out.println("Invalid Input");
                
        }
        
    }
}