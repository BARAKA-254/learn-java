import java.util.Scanner;

public class timeConverter {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in hrs: ");

        int time = scanner.nextInt();
        double newTime = time%12;
        
         
        if (time > 0 && time < 12){
            System.out.printf("Time in 12hr system is %.2f AM\n",newTime);
        }
        else if(time > 12 && time < 24){
            System.out.printf("Time in 12hr system is %.2f PM\n",newTime);
        }
        else if(time == 24 || time ==0){
            System.out.println("MIDNIGHT");
        }
        else if(time == 12){
            System.out.println("NOON");
        }
        else{
            System.out.println("Invalid Input");
        }
        scanner.close();
        
    }
}