

class varArgs{
    public static void main(String [] args){

        // VarArgs (variable arguments) - make it possible for a method to accept a varying number of arguments
                                        //make methods more flexible since they eliminate the need for overloaded methods
                                        //java will pack the arguments into an array
                                        // an ellipsis(...) is important for variable arguments

        System.out.println(add(2,3));
        

    }

    // an addition method using var args

    static int add(int... numbers){

        int sum = 0;

        // for loop to loop through the array of numbers as it adds each number to the sum
        for(int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        
        return sum;
    }


}