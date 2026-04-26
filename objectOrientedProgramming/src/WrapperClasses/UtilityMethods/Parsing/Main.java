public class Main {
    public static void main(String[] args){

        // converting Strings to their primitives
        // 1. converting integer string to its int primitive
        int Num1 = 7;
        int Num2 = 5;        
        String Number1 = Integer.toString(Num1);
        // the (+) operator below concatenates the number in the variable Number1(String) and the one in Num2(int)
        System.out.println(Number1 + Num2); 

        // the (+) operator below adds the numbers in the variables Num1 and Num3 since they are of the same datatype
        int Num3 = Integer.parseInt(Number1);
        System.out.println(Num3 + Num2);


        // 2. converting double strings to its double primitive
        double InitialPI = 3.142;
        //convert pi to a string and reassign it to StringPI
        String StringPI = Double.toString(InitialPI); 
        //convert the StringPI back to its primitive double and assign it to a new varable
        double NewPI = Double.parseDouble(StringPI);
        // find area of a circle
        double radius = 7;
        double area = NewPI * radius * radius;
        System.out.printf("Radius %.2f\n", area);

        // 3. converting boolean strings to its boolean primitive
        boolean amTall = true;
        //convert the above boolean to a string
        String amITall = Boolean.toString(amTall);
        //convert the string back to boolearn and reassign it to its initial variable
        amTall = Boolean.parseBoolean(amITall);
        System.out.println(amTall);


        // converting char string to its char primitive data type
        char at = '@';
        //convert the char to string
        String atSymbol = Character.toString(at);
        String username = "benati";
        String domain = "gmail.com";
    
        String EmailAddress = username + atSymbol + domain;
        System.out.println("Email address: " + EmailAddress);

        // To convert the atSymbol string back to char, we use the charAt() method since we don't have a parse method for char

        char newAtSymbol = atSymbol.charAt(0);
        System.out.println(newAtSymbol);
        
        System.out.println(username + newAtSymbol + domain);
    }
}
