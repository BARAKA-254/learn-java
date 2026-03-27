import java.util.Scanner;

class StringLinearSearch{
    public static void main(String [] args){

        String [] fruits = {"mango", "orange", "apple", "pineapple", "banana"};
        String target;
        boolean isFound = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which fruit would you like to search for: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println(target + " found at index " + i);
                isFound = true;

            }
        }
        if(!isFound){
            System.out.println(target + " not found in the array");
        }

    }
}