import java.util.Random;

public class randomGenerator {
    public static void main(String[] args){

        Random random = new Random();

        int number1 = random.nextInt(1,7);
        System.out.println(number1);
        
        double number2 = random.nextDouble();
        System.out.println(number2);
    }
}