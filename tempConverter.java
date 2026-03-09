import java.util.Scanner;

public class tempConverter{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        double temp;
        String choice;
        double newTemp;

        System.out.print("Enter temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celcius of Farenheit (C,F): ");
        choice = scanner.next().toUpperCase();

        newTemp = (choice.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("Temperature after conversion: %.2f \n", newTemp );

        scanner.close();
    }

}