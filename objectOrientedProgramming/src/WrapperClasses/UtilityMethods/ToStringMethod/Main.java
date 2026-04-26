public class Main {
    public static void main(String[] args) {
    
        // The toString() wrapper class utility method is used to convert primitive data types to Strings

        // convert an int to a string
        int Num1 = 18;
        String Number1 = Integer.toString(Num1);
        System.out.println(Number1);

        // convert a double to a string
        double PI = 3.142;
        String Number2 = Double.toString(PI);
        System.out.println(Number2);

        //convert a character to a string
        char at = '@';
        String letter = Character.toString(at);
        System.out.println(letter);

        // convert a boolean to a string
        boolean truce = true;
        String urrm = Boolean.toString(truce);
        System.out.println(urrm); 
    }
}