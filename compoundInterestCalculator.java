import java.util.Scanner;

class compoundInterestCalculator{
    public static void main(String [] args){

        double principal;
        int rate;
        int timesCompounded;
        int years;
        double amount;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (%): ");
        rate = scanner.nextInt() / 100;

        System.out.print("Enter times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate/timesCompounded), (timesCompounded*years));
        System.out.printf("Total amount: %,.2f\n", amount);
        scanner.close();

        
    
    }
}