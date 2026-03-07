
class stringMethods{
    public static void main(String [] args){


        String name = "Benard Baraka";

        int letters = name.length(); // returns the number of characters in the string
        char first = name.charAt(0); // returns the character at the specified index
        int index = name.indexOf("a"); // returns the index of the first occurence of the specified character
        int lastIndex = name.lastIndexOf("a"); // returns the index of the last occurence of the char

        name = name.toUpperCase(); // capitalizes the whole string
        name = name.toLowerCase(); // converts the whole string to lowercase

        name = name.trim(); // removes whitespace from either side of the string.
        name = name.replace("a", "o"); // replaces a character with another
        name = name.replace("o", "a");

        // check if a variable is empty
        boolean checkName = name.isEmpty(); 
        System.out.println(checkName);

        // returns a boolean value based of whether that variable has the parsed value or not
        boolean checkForChar = name.contains(" "); 
        System.out.println(checkForChar);
        
        // returns a boolean based on if the parsed string is equal to the one in variable
        boolean checkForEquals = name.equals("benard baraka"); 
        System.out.println(checkForEquals);

        // returns a boolean based on if the parsed string is equal to the one in variable while ignoring case
        boolean checkEqualIgnoreCase = name.equalsIgnoreCase("BENARD BARAKA");
        System.out.println(checkEqualIgnoreCase);
        System.out.println(name);
    }
}