
class twoDimensionalArrays{
    public static void main(String [] args){


        // 2D Array - arrays where each element is an array

        String [] fruits = {"mango", "orange", "apple"};
        String [] veges = {"pizza", "hotdog", "hamburger"};
        String [] meats = {"beef", "chicken", "pork"};

        String [][] groceries ={fruits,veges,meats};


        for(String[] foods: groceries){

            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}