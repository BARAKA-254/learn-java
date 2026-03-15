import java.util.Scanner;

public class cubingMethod{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to cube: ");
        double number = scanner.nextDouble();

        System.out.println( number+" Cubed: "+ cubeNumber(number));
        
        scanner.close();
    }
    public static double cubeNumber(double number){
        return number * number * number;
    }
}