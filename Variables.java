public class Variables{
    public static void main(String[] args){

        // Variables = container for a value
        // Java has two types of variables (Primitive and Reference)
        // Primitive = stored directly in memory(stack ds) ->int, double, char, boolean
        // Reference = memory address (stack) that points to (heap) [pointers involved] -> string,array,object


        // varible declaration and initialization

        
        int age;
        age = 19;
        String myName = "Benard Baraka";
        double myGpa = 4.0;
        int myYearOfStudy = 2;
        boolean isStudent;

        if(myYearOfStudy <= 4 && myYearOfStudy >=1){
            isStudent = true;
        }
        else{
            isStudent = false;
        }
        

        
        
        String myData = "Name: " + myName + "\nage: " + age + "\nGPA: " + myGpa;

        if(isStudent){
            System.out.println(myData);
        }
        else{
            System.out.println("You are not a registered student.");
        }
        

    }
}