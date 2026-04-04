import java.util.Scanner;

class ticketingProgram{
    public static void main(String [] args){
        
        double ticketPrice = 999.00;
        String studentStatus;
        boolean isStudent  = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
    
        System.out.print("Are you a student(yes/no): ");
        scanner.nextLine();
        studentStatus = scanner.nextLine();
        if(studentStatus == "yes"){
           isStudent = true;
        }
        else if(studentStatus == "no"){
            isStudent = false;
        }
        

        if(isStudent){
            System.out.println("You get a 10% discount");
            ticketPrice*=0.9;
            if(age>=60){
                System.out.println("You get another 20% discount");
                ticketPrice*=0.8;
                System.out.println("Your ticket price is " + ticketPrice);
            }
            System.out.println("Your ticket price is " + ticketPrice);
        }
        else if(age>=60){
            System.out.println("You get a 20% discount");
            ticketPrice*=0.8;
            System.out.println("Your ticket price is " + ticketPrice);
        }
        else{
            System.out.println("Your ticket price is " + ticketPrice);
        }

        scanner.close();
    }
}