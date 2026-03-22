import java.util.Scanner;

public class introToArrays{
    // Array == a collection of data of the same datatype.

    public static void main(String [] args){
        
        // arrays are denoted by square brackets [].

        /*
        SYNTAX
        datatype [] arrayName = { arrayItem1, arrayItem2, arrayItem3 };
        */
        String[] fruits = {"banana" , "orange", "apple"};
        System.out.println(fruits[0]);

        for(int i = 0; i<fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
    }
}