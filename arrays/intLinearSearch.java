import java.util.Scanner;

class intLinearSearch{
    public static void main(String [] args){
        
        int [] numbers = {3, 5, 7, 1, 9, 4, 2, 6};
        boolean isFound = false;
        int target ;

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a number to seach for: ");
        target = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(target==numbers[i]){
                System.out.println("Target: " + target + " found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println(target + " Not found in the array.");
        }
        
    }
}