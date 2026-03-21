import java.util.Scanner;

public class bankingProgram{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        System.out.println("***BANKING PROGRAM***");
        System.out.println("*********************");

        double balance = 0;
        boolean isRunning = true;

        while(isRunning){
            
            System.out.println("Choices: ");
            System.out.println("1.CHECK BALANCE. ");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW.");
            System.out.println("4.EXIT"); 
            System.out.print("Select one of the choices above: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance(balance);
                case 2 -> {
                    balance += deposit();
                    checkBalance(balance);
                }
                case 3 -> {
                    balance -= withdraw(balance);
                    checkBalance(balance);
                }
                case 4 -> {
                    System.out.println("Exiting!! ");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Input. ");
            }
            System.out.println("*********************");
            
        }
        System.out.println("*********************");
        System.out.println("*********************\n\n");
        
    }

    static void checkBalance(double balance){
        System.out.println("Balance: " + balance);
    }
    static double deposit(){
        System.out.print("Enter Amount to deposit: ");
        double amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount can not be less than 0.");
            return 0;
        }
        else{
            return amount;
        }
    
    }
    static double withdraw(double balance){
        System.out.print("Enter Amount to Withdraw: ");
        double amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount cannot be less than 0. ");
            return 0;
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance. ");
            return 0;
        }
        else{
            return amount;
        }
    }
}