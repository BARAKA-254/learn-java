import java.util.Scanner;

public class countDownTimer{
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value to count down from: ");
        int counter = scanner.nextInt();

        for(int i = counter; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");
    }
}