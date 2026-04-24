public class Main {
    public static void main(String[] args){
    
        // Wrapper classes  =   Allow primitive values (int, char, double, boolean) to be used as objects. "Wrap them in an object"
        //                      Generally, don't wrap primitives unless you want an object
        //                      Allows use of collections Framework and static Utility Methods


        /*
        // The method of wrapping below is depreciated and only used for demonstration

        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character("&");
        Boolean d = new Boolean(true);
        */

        // A modern approach to create wrapper classes is the one below(known as autoboxing)
        
        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        // similar to the creation of strings eg
        String e = "Elephant";

        //  Unboxing = converting a wrapper class back to it's primitive
        // to unbox , assign the wrapper class object to a variable declared with it's primitive datatype
        int x = a;
        double y = b;
        char z = c;
        boolean g = d;

        // converting a primitive data types into a String
        String f = Integer.toString(123);
        String h = Double.toString(30.23);
        String i = Boolean.toString(true);

        //concatenate them an assign them to a variable m
        String m = f + h + i;

        System.out.println(m);

    }   
}
