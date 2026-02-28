import java.util.Scanner;

class shoppingCart{
    public static void main(String[] args){

        System.out.println("Available Items:");
        System.out.println("1.Burger");
        System.out.println("2.Pizza");
        System.out.println("3.Pancakes");

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy 1,2,3: ");
        int item = scanner.nextInt();

        double burgerPrice = 100.0;
        double pizzaPrice = 400.0;
        double pancakesPrice = 120.0;

        System.out.print("How many would you like: ");
        int quantity = scanner.nextInt();

        scanner.close();

        double totalCost = 0;

        if(item == 1 ){
            totalCost = burgerPrice*quantity;
        }
        else if(item == 2 ){
            totalCost = pizzaPrice*quantity;
        }
        else if(item == 3 ){
            totalCost = pancakesPrice*quantity;
        }
        else{
            System.out.println("Irrelevant Input!!");
        }

        System.out.println(totalCost);


    }
}