public class Main {
    public static void main(String[] args) {
        
        // Exeption         =   An event that interrupts the normal flow of a program
        //                      (Dividing by zero, file not found, input mismatch type)
        // handled using    =   try{}, catch{}, finally{}


        // an example of dangerous code 
        //System.out.println(1/0); - this throws a ArithmeticException error
        
        // such code should be written like:
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Cannot divide by zero");
        }
    }
}
