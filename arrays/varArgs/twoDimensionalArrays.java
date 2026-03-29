
class twoDimensionalArrays{
    public static void main(String [] args){


        // 2D Array - arrays where each element is an array

        // 2D array declared once
        String [][] groceries = {{"mangoes", "apples", "bananas"},
                                 {"potato", "tomato", "carrots"},
                                 {"chicken", "pork", "beef", "fish"}
                                };

        // access an element and replace it from the array

        groceries [2][0] = "eggs";

        

        for(String[] foods : groceries){

            for(String food : foods){

                System.out.print(food + " ");

            }
            System.out.println();
        }
        System.out.println();

        // access and print an element from the array
        System.out.println("Last element: " + groceries[2][3]);


    }
}