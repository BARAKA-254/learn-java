import java.util.Scanner;

class arraysWithUserInput{
    public static void main(String [] args){

        String[] foods;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many foods would you like: ");
        int size = scanner.nextInt();
        scanner.nextLine();


        foods = new String[size];

        for(int i=0; i<foods.length; i++){
            System.out.print("Enter a food: ");
            foods [i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();

    }
}