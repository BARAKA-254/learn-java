
class twoDimensionalArrays{
    public static void main(String [] args){


        // 2D Array - arrays where each element is an array

        // 2D array declared once
        String [][] groceries = {{"mangoes", "apples", "bananas"},
                                 {"potato", "tomato", "carrots"},
                                 {"chicken", "pork", "beef", "fish"}
                                };

        for(String[] foods : groceries){

            for(String food : foods){

                System.out.print(food + " ");

            }
            System.out.println();
        }
    }
}