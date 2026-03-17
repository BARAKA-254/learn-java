import java.util.Scanner;
// Overloaded methods are methods that share the same name but have different parameters

public class overloadedMethods{
    
        
        
    public static void main(String [] args){
        int result;
        int numberOne;
        int numberTwo;
        int numberThree;
        int numberFour;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Numbers would you like to add: ");
        int numberOfInputs = scanner.nextInt();
        
        switch (numberOfInputs) {
            case 1 ->{
                System.out.println("Enter Number 1: ");
                numberOne = scanner.nextInt();
                System.out.println(numberOne);
            }  

            case 2 ->{
                System.out.print("Enter Number one: ");
                numberOne = scanner.nextInt(); 
                System.out.print("Enter Number two: ");
                numberTwo = scanner.nextInt();

                result = add(numberOne, numberTwo);
                System.out.println(result);
            }

            case 3 ->{
                System.out.print("Enter Number one: ");
                numberOne = scanner.nextInt();
                System.out.print("Enter Number two: ");
                numberTwo = scanner.nextInt(); 
                System.out.print("Enter Number three: ");
                numberThree = scanner.nextInt();

                result = add(numberOne, numberTwo, numberThree);
                System.out.println(result);
            }

            case 4 ->{
                System.out.print("Enter Number one: ");
                numberOne = scanner.nextInt();
                System.out.print("Enter Number two: ");
                numberTwo = scanner.nextInt(); 
                System.out.print("Enter Number three: ");
                numberThree = scanner.nextInt();
                System.out.print("Enter Number Four: ");
                numberFour = scanner.nextInt();

                result = add(numberOne, numberTwo, numberThree,numberFour);
                System.out.println(result);
            }

            default-> System.out.println("Invalid Input.");
                
        }
        scanner.close();
      
    }
    public static int add(int one, int two){
            return one + two;
    }
    public static int add(int one, int two, int three){
        return one + two + three;
    }
    public static int add(int one, int two, int three, int four){
        return one + two + three + four;
    }
}