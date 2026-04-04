import java.util.Scanner;

class weightConversion{
    public static void main(String [] args){

        System.out.println("Weight Conversion Program");
        System.out.println("-------------------------");
        System.out.println("1. Convert kgs to lbs. ");
        System.out.println("2. Convert lbs to kgs. ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Select one of the above choices 1,2: ");
        int choice = scanner.nextInt();
        System.out.print("Enter the weight to be converted: ");
        double weight = scanner.nextDouble();

        if(choice == 1){
            weight*=2.20462;
            System.out.printf("Weight in pounds is: %.2f\n", weight);
        }
        else if(choice==2) {
            weight/=2.20462;
            System.out.printf("Weight in Kgs: %.2f\n", weight);
        }
        else{
            System.out.println("Invalid Input.");
        }
        
        scanner.close();
    }
}